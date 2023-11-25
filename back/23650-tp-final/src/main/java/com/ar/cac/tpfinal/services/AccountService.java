package com.ar.cac.tpfinal.services;

import com.ar.cac.tpfinal.entities.Account;
import com.ar.cac.tpfinal.repositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private AccountRepository repository;
    public AccountService(AccountRepository repository){this.repository = repository;}

    public List<Account> getAccount(){
        List<Account> accounts =  repository.findAll();
        return  accounts;
    }
}
