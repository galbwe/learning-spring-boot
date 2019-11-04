package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Expense {
  private final UUID id;
  private BigDecimal amount;
  private Date date;
  private String description;

  public Expense(@JsonProperty("id") UUID id,
                 @JsonProperty("amount") BigDecimal amount,
                  @JsonProperty("date") Date date,
                  @JsonProperty("description") String description) {
    this.id = id;
    this.amount = amount;
    this.date = date;
    this.description = description;
  }

  public UUID getId() {
    return id;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public Date getDate() {
    return date;
  }

  public String getDescription() {
    return description;
  }
}
