package com.jade.stockquotemanager.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.SequenceGenerator;

@Getter
@Setter
public class StockManager {
    private String id;
    private String description;
}
