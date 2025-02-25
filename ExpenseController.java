package com.finance.controller;

import org.springframework.web.bind.annotation.*;
import com.finance.service.ExpenseService;
import com.finance.model.Expense;
import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return expenseService.addExpense(expense);
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    @GetMapping("/predict")
    public double predictFutureSpending() {
        return expenseService.predictSpending();
    }
}