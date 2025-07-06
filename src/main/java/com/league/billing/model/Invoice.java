package com.league.billing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customer;
    private Double amount;
    private LocalDate date;

    // Getters and setters
    public Long getId() { return id; }
    public String getCustomer() { return customer; }
    public void setCustomer(String customer) { this.customer = customer; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}
