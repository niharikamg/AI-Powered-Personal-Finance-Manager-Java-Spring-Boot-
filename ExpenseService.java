package com.finance.service;

import org.springframework.stereotype.Service;
import com.finance.model.Expense;
import com.finance.repository.ExpenseRepository;
import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public double predictSpending() {
        // Dummy AI logic for spending prediction
        double total = expenseRepository.findAll().stream().mapToDouble(Expense::getAmount).sum();
        return total * 1.1; // Predicts 10% more for the next month
    }
}