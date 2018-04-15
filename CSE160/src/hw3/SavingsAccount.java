//Joey Jiemjitpolchai 111613728
package hw3;

public class SavingsAccount extends Account{

	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(int id, double initial) {
		super(id, initial);
	}
	
	public void withDraw(int amt) {
		if(this.getBalance()-amt > 0) {
			this.setBalance(this.getBalance()-amt);
		}
		else {
			System.out.println("Cannot withdraw more than you have");
		}
	}
}
