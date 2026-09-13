package com.finance.finance.service;

import com.finance.finance.dto.AccountDto;
import com.finance.finance.entities.Account;
import com.finance.finance.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository repository;

    public void saveAccount(AccountDto dto){
        Account account =new Account();
        account.setName(dto.name());
        account.setValue(dto.value());
        account.setCategory(dto.category());

        repository.save(account);
    }

    public List<Account> findall(){;
        List<Account> accounts = repository.findAll();
        return accounts;
    }

    public Double total(){
        List<Account>accounts = repository.findAll();
        Double total =  accounts.stream().mapToDouble(Account::getValue).sum();
        return total;
    }



}
