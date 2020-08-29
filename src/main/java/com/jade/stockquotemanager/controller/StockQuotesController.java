package com.jade.stockquotemanager.controller;

import com.jade.stockquotemanager.client.StockManagerClient;
import com.jade.stockquotemanager.dto.StockQuotesDTO;
import com.jade.stockquotemanager.model.StockQuotes;
import com.jade.stockquotemanager.service.StockQuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stock-quotes")
public class StockQuotesController {
    @Autowired
    private StockQuotesService service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<StockQuotes> getAllStockQuotes() {
        return service.getAllStockQuotes();
    }

    /**
     * POST - 1a etapa
     */
    @RequestMapping(path = "/primeira-etapa", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public StockQuotesDTO addPrimeiraEtapa(@RequestBody StockQuotesDTO dto) {
        service.persistStockQuotes(dto);
        return dto;
    }

    /**
     * POST - 2a etapa
     */
    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addStockQuotes(@RequestBody StockQuotesDTO dto) throws Exception {
        boolean b = service.postStock(dto);
        if (!b) {
            return new ResponseEntity<>("stock já persistido", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("stock persistido com sucesso", HttpStatus.OK);
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<StockQuotes> getById(@PathVariable("id") String id){
        Optional<StockQuotes> stock = service.getById(id);
        return stock;
    }

}
