package com.cognizant.Account_ws.service;



import com.cognizant.Account_ws.feign.LoanClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    LoanClient loanClient;

    public String accountDetails(int id) {

        String loan = loanClient.getLoan(id);

        return "Account Found\n" + loan;

    }

}
