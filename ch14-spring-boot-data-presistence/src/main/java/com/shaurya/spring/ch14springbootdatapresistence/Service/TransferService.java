package com.shaurya.spring.ch14springbootdatapresistence.Service;

import com.shaurya.spring.ch14springbootdatapresistence.Model.Account;
import com.shaurya.spring.ch14springbootdatapresistence.Repository.AccountRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferService {

    private final AccountRepository accountRepository;
    @Autowired
    public TransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Transactional
    public void transfer(int idSender,int idReceiver,double amount) {
        Account sender = accountRepository.findById(idSender)
                .orElseThrow(()->new RuntimeException("sender not found"));
        Account receiver = accountRepository.findById(idReceiver)
                .orElseThrow(()->new RuntimeException("receiver not found"));

        double senderNewAmount =
                sender.getAmount() - amount;
        double receiverNewAmount =
                receiver.getAmount() + amount;

        accountRepository.changeAmount(idSender,senderNewAmount);
        accountRepository.changeAmount(idReceiver,receiverNewAmount);
    }

    public Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public List<Account> findAccountsByName(String name) {
        return accountRepository.findByName(name);
    }
}
