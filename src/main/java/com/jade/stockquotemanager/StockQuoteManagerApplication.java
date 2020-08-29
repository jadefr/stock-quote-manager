package com.jade.stockquotemanager;

import com.jade.stockquotemanager.dto.NotificationDTO;
import com.jade.stockquotemanager.service.StockQuotesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableFeignClients
public class StockQuoteManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockQuoteManagerApplication.class, args);
    }
}
