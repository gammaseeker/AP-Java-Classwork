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
	
	void testSubtract() {
			
		}
	
	void testMultiply() {
		
	}
	
	void testDivide() {
		
	}
	

}
