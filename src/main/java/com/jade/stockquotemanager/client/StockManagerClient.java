package com.jade.stockquotemanager.client;

import com.jade.stockquotemanager.dto.NotificationDTO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(contextId = "stockManagerClient", name = "stockManagerClient", url = "http://192.168.99.100:8080")
public interface StockManagerClient {
    @RequestMapping(method = RequestMethod.GET, value = "/stock")
    String getStocks();

    @RequestMapping(method = RequestMethod.POST, value = "/notification")
    @Headers({"Content-Type:application/json"})
    String notify(@RequestBody NotificationDTO dto);
}
