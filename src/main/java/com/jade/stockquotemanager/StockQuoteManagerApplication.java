package com.jade.stockquotemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StockQuoteManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockQuoteManagerApplication.class, args);
    }

}
