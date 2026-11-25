package com.example.spring_medium.l15_value.service;

import org.springframework.stereotype.Service;

@Service
public class ReceiptService {
    private final PriceTagService priceTagService;

    public ReceiptService(PriceTagService priceTagService) {
        this.priceTagService = priceTagService;
    }

    public String buildReceiptLine(String itemName, int quantity) {
        String priceLine = priceTagService.formatPrice(itemName);
        return priceLine + " | Кол-во: " + quantity;
    }
}
