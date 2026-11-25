package com.example.spring_medium.l15_value.service;

import org.springframework.stereotype.Service;

@Service
public class MenuLineService {

    private final PriceTagService priceTagService;

    public MenuLineService(PriceTagService priceTagService) {
        this.priceTagService = priceTagService;
    }

    public String buildMenuLine(String itemName, boolean available) {
        String priceText = priceTagService.formatPrice(itemName);
        String status = available ? "в наличии" : "закончилось";
        return priceText + " (" + status + ")";
    }
}
