package com.jade.stockquotemanager.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class StockQuotes {

    @Id
    private String id;
    private String quotes;
}
