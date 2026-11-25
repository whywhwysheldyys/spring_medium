//package com.example.spring_medium.l14_profile.interfaces;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//interface NotificationSender {
//    void send(String message);
//}
//
//@Configuration
//class NotificationConfig {
//
//    @Bean
//    @Profile("dev")
//    NotificationSender consoleSender() {
//        return message -> System.out.println("[DEV CONSOLE] " + message);
//    }
//
//    @Bean
//    @Profile("!dev")
//    NotificationSender realSender() {
//        return message -> System.out.println("[PROD GATEWAY] Отправка: " + message);
//    }
//}
//
//@SpringBootApplication
//public class ProfileDemoApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(ProfileDemoApplication.class, args);
//    }
//
//    @Bean
//    CommandLineRunner demoRunner(NotificationSender sender) {
//        return args -> {
//            System.out.println("=== Активный бин: " + sender.getClass().getName() + " ===");
//            sender.send("Заказ #42 готов к выдаче");
//        };
//    }
//}