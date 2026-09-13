package com.finance.finance.dto;

import com.finance.finance.entities.Category;

public record AccountDto(String name,Double value ,Category category) {
}
