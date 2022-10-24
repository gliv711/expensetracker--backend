package com.nederproject.expensetracker.service;

import com.nederproject.expensetracker.model.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> findAll();

}
