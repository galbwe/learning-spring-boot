package com.example.demo.dao;

import com.example.demo.model.Expense;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeExpenseDataAccessService implements ExpenseDao {

  private static List<Expense> DB = new ArrayList<>();

  @Override
  public int insertExpense(UUID id, Expense expense) {
    DB.add(new Expense( id, expense.getAmount(), expense.getDate(), expense.getDescription()));
    return 1;
  }

  @Override
  public List<Expense> getAllExpenses() {
    return DB;
  }
}
