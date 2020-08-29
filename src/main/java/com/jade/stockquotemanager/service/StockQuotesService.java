package com.jade.stockquotemanager.service;

import com.jade.stockquotemanager.dto.Quotes;
import com.jade.stockquotemanager.dto.StockQuotesDTO;
import com.jade.stockquotemanager.model.StockQuotes;
import com.jade.stockquotemanager.repository.StockQuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockQuotesService {

    private final StockQuotesRepository repository;

    @Autowired
    public StockQuotesService(StockQuotesRepository repository) {
        this.repository = repository;
    }

    public List<StockQuotes> getAllStockQuotes() {
        return repository.findAll();
    }

    public void persistStockQuotes(StockQuotesDTO dto) {

        String id = dto.getId();
        List<Quotes> quotes = dto.getQuotes();

        StringBuilder sb = new StringBuilder();
        String pair = "";

        String virgula = "; ";
        for (int i = 0; i < quotes.size(); i++) {

            if(i == quotes.size() - 1) {
                virgula = "";
            }

            pair = quotes.get(i).getDay() + " : " + quotes.get(i).getValue() + virgula;
            sb.append(pair);
        }

        StockQuotes sq = StockQuotes.builder()
                .id(id)
                .quotes(sb.toString())
                .build();

        repository.save(sq);
    }

    public Optional<StockQuotes> getById(String id) {
        return repository.findById(id);
    }
}
