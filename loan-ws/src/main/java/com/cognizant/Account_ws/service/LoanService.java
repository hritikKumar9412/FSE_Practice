package com.cognizant.Account_ws.service;


import org.springframework.stereotype.Service;

@Service
public class LoanService {

    public String getLoan(int id) {

        return "Loan Details for Customer Id : " + id;

    }

}
