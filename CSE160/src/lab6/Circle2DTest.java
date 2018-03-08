package lab6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Circle2DTest {

	@Test
	void testGetX() {
		Circle2D c = new Circle2D(10.0, 14.0, 12.0);
		assertEquals(10.0, c.getX());
	}

	@Test
	void testGetY() {
		Circle2D c = new Circle2D(10.0, 14.0, 12.0);
		assertEquals(14.0, c.getY());
	}

	@Test
	void testGetRadius() {
		Circle2D c = new Circle2D(10.0, 14.0, 12.0);
		assertEquals(12.0, c.getRadius());
	}

	@Test
	void testGetArea() {
		Circle2D c = new Circle2D(10.0, 14.0, 12.0);
		assertEquals(Math.PI * Math.pow(12.0, 2), c.getArea());
	}

	@Test
	void testGetPerimeter() {
		Circle2D c = new Circle2D(10.0, 14.0, 12.0);
		assertEquals(2 * Math.PI * 12.0, c.getPerimeter());
	}

}
