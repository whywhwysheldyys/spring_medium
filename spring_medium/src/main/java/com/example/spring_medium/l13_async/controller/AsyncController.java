package com.example.spring_medium.l13_async.controller;

import jakarta.annotation.PreDestroy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
@RequestMapping("/api/lab/async")
public class AsyncController {

    private final ExecutorService executor = Executors.newFixedThreadPool(2);

    @GetMapping
    public Map<String, Object> runParallel() {
        long start = System.currentTimeMillis();

        CompletableFuture<String> orderCheck = CompletableFuture.supplyAsync(
                () -> loadPart("OrderCheck", 600),
                executor
        );

        CompletableFuture<String> paymentCheck = CompletableFuture.supplyAsync(
                () -> loadPart("PaymentCheck", 600),
                executor
        );

        CompletableFuture.allOf(orderCheck, paymentCheck).join();
        long elapsed = System.currentTimeMillis() - start;

        return Map.of(
                "orderCheck", orderCheck.join(),
                "paymentCheck", paymentCheck.join(),
                "totalTimeMs", elapsed
        );
    }

    private String loadPart(String taskName, long delayMs) {
        try {
            Thread.sleep(delayMs);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return taskName + " -> " + Thread.currentThread().getName();
    }

    @PreDestroy
    public void cleanup() {
        executor.shutdown();
    }
}