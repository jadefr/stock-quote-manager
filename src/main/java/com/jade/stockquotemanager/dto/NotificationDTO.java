package com.jade.stockquotemanager.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class NotificationDTO {
    private String host;
    private String port;
}
