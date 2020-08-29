package com.jade.stockquotemanager.repository;

import com.jade.stockquotemanager.model.StockQuotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockQuotesRepository extends JpaRepository<StockQuotes, String> {
}
