package com.example.spring_medium.l15_value.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PriceTagService {
    private final double defaultPrice;
    private final String currency;

     public PriceTagService(
             @Value("${app.item.default-price:4.50}") double defaultPrice,
             @Value("${app.item.currency:BYN}") String currency
     ) {
         this.defaultPrice = defaultPrice;
         this.currency = currency;
     }

    public String formatPrice(String itemName) {
        return itemName + ": " + defaultPrice + " " + currency;
    }
}