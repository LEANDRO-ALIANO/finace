package com.finance.finance.repository;

import com.finance.finance.entities.Account;
import com.finance.finance.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{
}
