package com.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.finance.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}