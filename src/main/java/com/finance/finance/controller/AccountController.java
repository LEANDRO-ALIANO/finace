package com.finance.finance.controller;

import com.finance.finance.dto.AccountDto;
import com.finance.finance.entities.Account;
import com.finance.finance.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService service;

    @PostMapping(value = "/save")
    public ResponseEntity<String> save(@RequestBody AccountDto dto){
        service.saveAccount(dto);

        return ResponseEntity.ok().body("conta cadastrada com sucesso");

        }
    @GetMapping("/accounts")
    ResponseEntity<List<Account>> findall(){
        List<Account>accounts = service.findall();
        return ResponseEntity.ok(accounts);
    }
    @GetMapping("/total")
    ResponseEntity<Double> total(){
        Double total = service.total();
        return ResponseEntity.ok(total);
    }
}
