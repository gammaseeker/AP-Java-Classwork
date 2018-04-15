//Joey Jiemjitpolchai 111613728
package hw3;

public class AccountTest {

	public static void main(String[] args) {
		Account a = new Account(1122, 20000);
		a.setAnnualInterestRate(4.5);
		a.withDraw(2500);
		a.deposit(3000);
		System.out.println("Account");
		System.out.println("Balance: $" + a.getBalance());
		System.out.println("Monthly Interest: " + a.getMonthlyInterestRate() + "%");
		System.out.println("Date: " + a.getDate());
		
		SavingsAccount s = new SavingsAccount(1122, 20000);
		s.setAnnualInterestRate(4.5);
		s.withDraw(2500);
		s.deposit(3000);
		System.out.println("Savings Account");
		System.out.println(s.toString());
		
		CheckingAccount c = new CheckingAccount(1122, 20000);
		c.setAnnualInterestRate(4.5);
		c.withDraw(2500);
		c.deposit(3000);
		System.out.println("Checking Account");
		System.out.println(c.toString());
	}
}
