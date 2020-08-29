package com.jade.stockquotemanager.startup;

import com.jade.stockquotemanager.dto.NotificationDTO;
import com.jade.stockquotemanager.service.StockQuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Startup {

//    @Autowired StockQuotesService service;
//
//    @PostConstruct
//    void init(StockQuotesService service) {
//        NotificationDTO dto = NotificationDTO.builder()
//                .host("localhost")
//                .port("8081")
//                .build();
//        service.notificar(dto);
//    }
}
