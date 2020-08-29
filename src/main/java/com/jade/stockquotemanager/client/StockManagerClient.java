package com.jade.stockquotemanager.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(contextId = "stockManagerClient", name = "stockManagerClient", url = "http://192.168.99.100:8080/stock")
public interface StockManagerClient {
    @RequestMapping(method = RequestMethod.GET, value = "")
    String getStocks();
}
