package br.com.fiap.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    private int id;
    private Account acc_id;
    private String title;
    private String description;
    private BigDecimal value;
    private LocalDate dateTransaction;
    
    public Transaction(int id, Account account_id, String title, String description, BigDecimal value, LocalDate dateTransaction) {
        this.id = id;
        this.acc_id = account_id;
        this.title = title;
        this.description = description;
        this.value = value;
        this.dateTransaction = dateTransaction;
    }
    public Transaction(Account account_id, String title, String description, BigDecimal value, LocalDate dateTransaction) {
        this.acc_id = account_id;
        this.title = title;
        this.description = description;
        this.value = value;
        this.dateTransaction = dateTransaction;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Account getAccount() {
        return acc_id;
    }
    public void setAccount(Account account) {
        this.acc_id = account;
    }
    public String getTitle() {
    	return title;
    }
    public void setTitle(String title) {
    	this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getValue() {
        return value;
    }
    public void setValue(BigDecimal value) {
        this.value = value;
    }
    public LocalDate getDateTransaction() {
        return dateTransaction;
    }
    public void setDateTransaction(LocalDate dateTransaction) {
        this.dateTransaction = dateTransaction;
    }
   
    @Override
    public String toString() {
        return "Transaction [id=" + id + ", account=" + acc_id.getId() + ", Title=" + title +", description=" + description + ", value=" + value + ", dateTransaction=" + dateTransaction + "]";
    }
}
