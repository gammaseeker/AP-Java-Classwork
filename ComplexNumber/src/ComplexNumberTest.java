import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ComplexNumberTest {
	ComplexNumber myNum;
	ComplexNumber myNum2;

	@BeforeEach
	void setUp() throws Exception {
		myNum = new ComplexNumber(5, 6);
		myNum2 = new ComplexNumber(7, 18);
	}

	@Test
	void testA() {
		assertEquals(5, myNum.getA(), "A is 5");
	}
	
	@Test
	void testB() {
		assertEquals(6, myNum.getB(), "B is 6");
	}
	
	@Test
	void testAdd() {
		assertEquals("12.0+24.0i", myNum.add(myNum2).toString(), "A is 12 and B is 24");
	}
	
	@Test
	void testSubtract() {
		assertEquals("-2.0-12.0i", myNum.subtract(myNum2).toString(), "A is -2 and B is -12");	
	}
	
	@Test
	void testMultiply() {
		assertEquals("-73.0+132.0i", myNum.multiply(myNum2).toString(), "A is -73 and B is 132");	
	}
	
	@Test
	void testDivide() {
		assertEquals("0.38337801608579086-0.128686327077748i", myNum.divideBy(myNum2).toString());	
	}
	

}
