//Joey Jiemjitpolchai 111613728
package hw3;

import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		this(0,0);
	}
	
	public Account(int id, double initial) {
		this.id = id;
		this.balance = initial;
		dateCreated = new Date();
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getRate() {
		return this.annualInterestRate;
	}
	
	public Date getDate() {
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return this.annualInterestRate/12.0;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double rate) {
		this.annualInterestRate = rate;
	}
	
	public void setDate(Date d) {
		this.dateCreated = d;
	}
	
	public void withDraw(double amt) {
		this.balance -= amt;
	}
	
	public void deposit(double amt) {
		this.balance += amt;
	}
	
	public String toString() {
		return "Balance: $" + this.getBalance() + "\n" + "Monthly Interest: " + this.getMonthlyInterestRate() + "%\n" + "Date: " + this.getDate();
	}
}
