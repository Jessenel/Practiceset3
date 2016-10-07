package account;

import java.util.Date;


public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;
	
	
	public Account(){
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
		
		
		
		
	}
	public Account(int newId, double initialBalance) {
		id = newId;
		balance = initialBalance;		
		dateCreated = new java.util.Date();
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		this.id = newId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(java.util.Date newdateCreated) {
		this.dateCreated = newdateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
		
	}
	
	public void withdraw(double amount) {
		
		balance -= amount;
	}
	
	public void deposit (double amount){
		
		balance += amount;
	}
	
	

}
