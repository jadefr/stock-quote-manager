package com.jade.stockquotemanager.controller;

import com.jade.stockquotemanager.client.StockManagerClient;
import com.jade.stockquotemanager.dto.StockQuotesDTO;
import com.jade.stockquotemanager.model.StockQuotes;
import com.jade.stockquotemanager.service.StockQuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stock-quotes")
public class StockQuotesController {
    @Autowired
    private StockQuotesService service;

    @Autowired
    private StockManagerClient client;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<StockQuotes> getAllStockQuotes() {
        return service.getAllStockQuotes();
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public StockQuotesDTO addStockQuotes(@RequestBody StockQuotesDTO dto) {
        service.persistStockQuotes(dto);
        return dto;
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<StockQuotes> getById(@PathVariable("id") String id){

        Optional<StockQuotes> stock = service.getById(id);

        return stock;
    }

}
