package com.shaurya.spring.ch14springbootdatapresistence.Controller;

import com.shaurya.spring.ch14springbootdatapresistence.Model.Account;
import com.shaurya.spring.ch14springbootdatapresistence.Model.TransferRequest;
import com.shaurya.spring.ch14springbootdatapresistence.Service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    private final TransferService transferService;
    @Autowired
    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public void TransferMoney(
            @RequestBody TransferRequest transferRequest
            ){
        transferService.transfer(transferRequest.getSenderId(),
                transferRequest.getReceiverId(),
                transferRequest.getBalance());
    }
    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(
            @RequestParam(required = false) String name
    ) {
        if (name == null) {
            return transferService.getAllAccounts();
        } else {
            return transferService.findAccountsByName(name);
        }
    }
}
