//Joey Jiemjitpolchai, 111613728
package hw2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.Assert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Hw2Test {

	@Test
	void testCount() {
		assertTrue(Arrays.equals(new int[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, Hw2.count("1")));
		assertTrue(Arrays.equals(new int[] {0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, Hw2.count("Cat 123")));
		assertTrue(Arrays.equals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, Hw2.count("Cat")));
		assertTrue(Arrays.equals(new int[] {1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, Hw2.count("1234567891234567890")));
	}
	
	@Test
	void testBinaryToHex() {
		int dec = Integer.parseInt("1101", 2);
		String hexStr = Integer.toString(dec, 16);
		assertEquals(hexStr.toUpperCase(), Hw2.binaryToHex("1101"));
		
		dec = Integer.parseInt("110010101011", 2);
		hexStr = Integer.toString(dec, 16);
		assertEquals(hexStr.toUpperCase(), Hw2.binaryToHex("110010101011"));
	}
	
	@Test
	void testSort() {
		assertEquals("abcd", Hw2.sort("bdac"));
		assertEquals("efgh", Hw2.sort("hgfe"));
		assertEquals("ijkl", Hw2.sort("kilj"));
	}

}
