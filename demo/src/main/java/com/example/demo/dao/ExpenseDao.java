package com.example.demo.dao;

import com.example.demo.model.Expense;

import java.util.UUID;
import java.util.List;

public interface ExpenseDao {

  int insertExpense(UUID id, Expense expense);

  List<Expense> getAllExpenses();

  default int addExpense(Expense expense){
    UUID id = UUID.randomUUID();
    return insertExpense(id, expense);
  }
}
