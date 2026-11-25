package com.example.spring_medium.l15_value.config;

import com.example.spring_medium.l15_value.service.PriceTagService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class PriceTagRunner {

    @Bean
    CommandLineRunner priceRunner(PriceTagService priceTagService) {
        return args -> {
            String result = priceTagService.formatPrice("Капучино");
            System.out.println(result);
        };
    }
}