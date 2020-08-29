package com.jade.stockquotemanager.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StockManagerResponse {
    private List<StockManager> list;
}
