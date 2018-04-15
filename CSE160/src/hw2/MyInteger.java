//Joey Jiemjitpolchai 111613728
package hw2;

public class MyInteger {
	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean isEven() {
		return this.value%2 == 0;
	}
	
	public boolean isOdd() {
		return this.value%2 == 1;
	}
	
	public boolean isPrime() {
		if(this.value < 2) {
			return false;
		}
		if(this.value == 2) {
			return true;
		}
		if(this.isEven()) {
			return false;
		}
		for(int i = 3; i * i <= this.value; i+= 2) {
			if(this.value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int value) {
		return value%2 == 0;
	}
	
	public static boolean isOdd(int value) {
		return value%2 == 1;
	}
	
	public static boolean isPrime(int value) {
		if(value < 2) {
			return false;
		}
		if(value == 2) {
			return true;
		}
		if(isEven(value)) {
			return false;
		}
		for(int i = 3; i * i <= value; i+= 2) {
			if(value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger value) {
		return value.getValue()%2 == 0;
	}
	
	public static boolean isOdd(MyInteger value) {
		return value.getValue()%2 == 1;
	}
	
	public static boolean isPrime(MyInteger value) {
		if(value.getValue() < 2) {
			return false;
		}
		if(value.getValue() == 2) {
			return true;
		}
		if(isEven(value)) {
			return false;
		}
		for(int i = 3; i * i <= value.getValue(); i+= 2) {
			if(value.getValue() % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(int value) {
		return this.value == value;
	}
	
	public boolean equals(MyInteger num) {
		return this.equals(num.getValue());
	}
	
	public static int parseInt(String str) {
		return Integer.parseInt(str);
	}
	
}
