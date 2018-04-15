//Joey Jiemjitpolchai 111613728
package hw3;

public class CheckingAccount extends Account{
	private int overdraft;
	
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(int id, double initial) {
		super(id, initial);
	}
	
	public void withDraw(int amt) {
		if(this.getBalance()-amt > overdraft) { //overdraft condition
			this.setBalance(this.getBalance()-amt);
		}
		else {
			System.out.println("Cannot withdraw that amount");
		}
	}
	
	public void setOverdraft(int overdraft) {
		this.overdraft = overdraft;
	}
	
	public int getOverdraft() {
		return this.overdraft;
	}
}
