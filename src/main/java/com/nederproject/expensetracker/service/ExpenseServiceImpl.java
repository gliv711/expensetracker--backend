package com.nederproject.expensetracker.service;

import com.nederproject.expensetracker.model.Expense;
import com.nederproject.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    ExpenseRepository expenseRepository ;

    public List<Expense> findAll(){
        return expenseRepository.findAll();
    }
}
