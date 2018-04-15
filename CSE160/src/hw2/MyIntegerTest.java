//Joey Jiemjitpolchai 111613728
package hw2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyIntegerTest {

	private MyInteger a;
	private MyInteger b;
	private MyInteger c;
	
	@BeforeEach
	void setUp() throws Exception {
		a = new MyInteger(5);
		b = new MyInteger(10);
		c = new MyInteger(5);
	}
	
	@After
    public void tearDown() {
        a = null;
        b = null;
        c = null;
    }
    

	@Test
	void testGetValue() {
		assertEquals(5, a.getValue());
		assertEquals(10, b.getValue());
		assertEquals(5, c.getValue());
	}
	
	@Test
	void testIsEven() {
		assertEquals(false, a.isEven());
		assertEquals(true, b.isEven());
		assertEquals(false, c.isEven());
	}
	
	@Test
	void testIsOdd() {
		assertEquals(true, a.isOdd());
		assertEquals(false, b.isOdd());
		assertEquals(true, c.isOdd());
	}
	
	@Test
	void testIsPrime() {
		assertEquals(true, a.isPrime());
		assertEquals(false, b.isPrime());
		assertEquals(true, c.isPrime());
	}
	
	@Test
	void testIsEvenMyInt() {
		assertEquals(false, MyInteger.isEven(a));
		assertEquals(true, MyInteger.isEven(b));
		assertEquals(false, MyInteger.isEven(c));
	}
	
	@Test
	void testIsOddMyInt() {
		assertEquals(true, MyInteger.isOdd(a));
		assertEquals(false, MyInteger.isOdd(b));
		assertEquals(true, MyInteger.isOdd(c));
	}
	
	@Test
	void testIsPrimeMyInt() {
		assertEquals(true, MyInteger.isPrime(a));
		assertEquals(false, MyInteger.isPrime(b));
		assertEquals(true, MyInteger.isPrime(c));
	}
	
	@Test
	void testEquals() {
		assertEquals(false, a.equals(b));
		assertEquals(false, a.equals(10));
		assertEquals(true, a.equals(c));
		assertEquals(true, a.equals(5));
	}
	
	@Test
	void testParseInt() {
		assertEquals(19, MyInteger.parseInt("19"));
		assertEquals(1473289, MyInteger.parseInt("1473289"));
	}
}
