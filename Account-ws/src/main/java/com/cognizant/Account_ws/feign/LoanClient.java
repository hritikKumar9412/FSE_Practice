package com.cognizant.Account_ws.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "LOAN-WS")
public interface LoanClient {

    @GetMapping("/loan/{id}")
    String getLoan(@PathVariable int id);

}