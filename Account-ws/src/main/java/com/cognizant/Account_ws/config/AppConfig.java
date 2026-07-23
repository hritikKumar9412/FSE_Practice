package com.cognizant.Account_ws.config;




import org.springframework.stereotype.Service;

@Service
public class AppConfig {

    public String getLoan(int id) {

        return "Loan Details for Customer Id : " + id;

    }

}
