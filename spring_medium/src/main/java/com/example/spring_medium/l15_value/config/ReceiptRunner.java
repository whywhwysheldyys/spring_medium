package com.example.spring_medium.l15_value.config;

import com.example.spring_medium.l15_value.service.ReceiptService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ReceiptRunner {

    @Bean
    CommandLineRunner secondReceiptRunner(ReceiptService receiptService) {
        return args -> {
            String line = receiptService.buildReceiptLine("Капучино", 2);
            System.out.println(line);
        };
    }
}
