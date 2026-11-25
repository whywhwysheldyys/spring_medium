//package com.example.spring_medium.l15_value.config;
//
//import com.example.spring_medium.l15_value.service.PortionService;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//class PortionRunnerConfig {
//
//    @Bean
//    CommandLineRunner portionRunner(PortionService portionService) {
//        return args -> {
//            String result = portionService.formatPortion("Эспрессо");
//            System.out.println("Результат работы PortionService: " + result);
//        };
//    }
//}