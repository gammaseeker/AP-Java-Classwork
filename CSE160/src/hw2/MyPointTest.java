//Joey Jiemjitpolchai, 111613728
package hw2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyPointTest {

	private MyPoint p;
	private MyPoint q;
	@BeforeEach
	void setUp() throws Exception {
		p = new MyPoint();
		q = new MyPoint(10, 30.5);
	}

	@Test
	void testGetX() {
		assertEquals(0, p.getX());
		assertEquals(10, q.getX());
	}

	@Test
	void testGetY() {
		assertEquals(0, p.getY());
		assertEquals(30.5, q.getY());
	}
	
	@Test
	void testDistance() {
		assertEquals(32.09750769140807, p.distance(q));
		assertEquals(0, p.distance(0, 0));
		assertEquals(5.385164807134504, p.distance(2, 5));
		assertEquals(32.09750769140807, q.distance(p));
		assertEquals(0, q.distance(10, 30.5));
		assertEquals(28.935272592460574, q.distance(5, 2));
	}
}
