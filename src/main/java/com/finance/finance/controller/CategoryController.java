package com.finance.finance.controller;

import com.finance.finance.dto.AccountDto;
import com.finance.finance.dto.CategoryDto;
import com.finance.finance.service.AccountService;
import com.finance.finance.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService service;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody CategoryDto dto){
        service.saveCategory(dto);

        return ResponseEntity.ok().body("categoria criada com sucesso");

    }
}
