package com.jade.stockquotemanager;

import com.jade.stockquotemanager.dto.NotificationDTO;
import com.jade.stockquotemanager.repository.StockQuotesRepository;
import com.jade.stockquotemanager.service.StockQuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class StockQuoteManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockQuoteManagerApplication.class, args);
    }

//    @Bean
//    CommandLineRunner init(StockQuotesService service) {
//        NotificationDTO dto = NotificationDTO.builder()
//                .host("localhost")
//                .port("8081")
//                .build();
//        service.notifyAtStartup(dto);
//
//        return args -> {
//
//        };
//    }
}
