package com.jade.stockquotemanager.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Quotes {
    private String value;
    private String day;
}
