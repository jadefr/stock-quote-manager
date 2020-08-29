package com.jade.stockquotemanager.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockQuotesDTO {
    private String id;
    private List<Quotes> quotes;
}
