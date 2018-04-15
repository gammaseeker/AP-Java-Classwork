//Joey Jiemjitpolchai 111613728
package hw3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hw2.MyPoint;

class ArrayListTest {

	private ArrayList<Integer> i;
	private ArrayList<String> s;
	@BeforeEach
	void setUp() throws Exception {
		i = new ArrayList<Integer>();
		s = new ArrayList<String>();
		i.add(1);
		s.add("Hello");
		s.add("World");
	}

	@After
    public void tearDown() {
        i = null;
        s = null;
    }
	
	@Test
	void testAdd() {
		assertEquals("[1]", i.toString());
		assertEquals("[Hello, World]", s.toString());
	}
	
	@Test
	void testClear() {
		i.clear();
		s.clear();
		assertEquals("[]", i.toString());
		assertEquals("[]", s.toString());
	}

	@Test
	void testContains() {
		assertEquals(true, i.contains(1));
		assertEquals(false, i.contains(3));
		assertEquals(true, s.contains("World"));
		assertEquals(false, s.contains("Cat"));
	}
	
	@Test
	void testGet() {
		assertEquals(1, i.get(0));
		assertEquals(null, i.get(50));
		assertEquals("World", s.get(1));
	}
	
	@Test
	void testIndexOf() {
		assertEquals(0, i.indexOf(1));
		assertEquals(0, s.indexOf("Hello"));
		assertEquals(-1, i.indexOf("Hello"));
	}
	
	@Test
	void testIsEmpty() {
		i.clear();
		s.clear();
		assertEquals(true, s.isEmpty());
		assertEquals(true, i.isEmpty());
		i.add(1);
		s.add("s");
		assertEquals(false, s.isEmpty());
		assertEquals(false, i.isEmpty());
		
	}
	
	@Test
	void testLastIndexOf() {
		i.add(1);
		i.add(1);
		s.add("Hello");
		s.add("!");
		assertEquals(2, i.lastIndexOf(1));
		assertEquals(2, s.lastIndexOf("Hello"));
		assertEquals(3, s.lastIndexOf("!"));
		assertEquals(-1, i.lastIndexOf(3));
	}
	
	@Test 
	void testRemove(){
		//return boolean
		assertEquals(true, i.remove(new Integer(1)));
		assertEquals(true, s.remove("Hello"));
		//return Object
		i.add(1);
		assertEquals(1, i.remove(0));
	}
	
	@Test
	void testSize() {
		assertEquals(1, i.size());
		assertEquals(2, s.size());
	}
	
	@Test
	void testSet() {
		assertEquals(1, i.set(0, 5));
		assertEquals("World", s.set(1, "hi"));
	}
}
