//package com.example.spring_medium.l15_value.service;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//@Service
//public class PortionService {
//    private final int defaultPortions;
//    private final String unitLabel;
//
//    public PortionService(
//            @Value("${app.portion.default-count:1}") int defaultPortions,
//            @Value("${app.portion.unit:шт.}") String unitLabel
//    ) {
//        this.defaultPortions = defaultPortions;
//        this.unitLabel = unitLabel;
//    }
//    public String formatPortion(String drinkName) {
//        return drinkName + " - " + defaultPortions + " " + unitLabel;
//    }
//}