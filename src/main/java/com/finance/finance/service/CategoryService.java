package com.finance.finance.service;

import com.finance.finance.dto.AccountDto;
import com.finance.finance.dto.CategoryDto;
import com.finance.finance.entities.Account;
import com.finance.finance.entities.Category;
import com.finance.finance.repository.AccountRepository;
import com.finance.finance.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository repository;

    public Category saveCategory(CategoryDto dto){
        Category category = new Category();
        category.setName(dto.name());


        return repository.save(category);
    }



}
