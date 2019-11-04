package com.example.demo.api;

import com.example.demo.model.Expense;
import com.example.demo.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@RequestMapping("api/v1/expenses")
@RestController
public class ExpenseController {
  private final ExpenseService expenseService;

  @Autowired
  public ExpenseController( ExpenseService expenseService ) {
    this.expenseService = expenseService;
  }

  @PostMapping
  public void addExpense (@RequestBody Expense expense ) {
    expenseService.addExpense(expense);
  }

  @GetMapping
  public List<Expense> getAllExpenses() {
    return expenseService.getAllExpenses();
  }

}
