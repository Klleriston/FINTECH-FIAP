package br.com.fiap.models;

import java.math.BigDecimal;

public class Account {
	
	private int id;
	private String name;
	private String document_id;
	private BigDecimal balance;
	
	public Account(int id, String name, String document_id, BigDecimal balance) {
		super();
		this.id = id;
		this.name = name;
		this.document_id = document_id;
		this.balance = balance;
	}
	public Account(String name, String documentId, BigDecimal balance) {
        this.name = name;
        this.document_id = documentId;
        this.balance = balance;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocument_id() {
		return document_id;
	}
	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	@Override
    public String toString() {
        return "User [id=" + id + ", \n name=" + name + ", \n balace=" + balance + "\n Document =" + document_id + "]";
    }
	
	
}
