//Joey Jiemjitpolchai 111613728
package hw3;

public class ArrayList<E> {
	private Object[] array;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	
	public ArrayList() {
		array = new Object[DEFAULT_CAPACITY];
	}
	
	public void add(Object o) {
		if(size >= array.length) {
			Object[] helper = new Object[array.length * 2];
			for(int i = 0 ; i < array.length; i++) {
				helper[i] = array[i];
			}
			array = helper;
			helper[size] = o;
			
		}
		else {
			array[size] = o;
			
		}
		size++;
		
	}
	
	public void clear() {
		for(int i = 0; i < array.length; i++) {
			array[i] = null;
		}
		size = 0;
	}
	
	public boolean contains(Object o) {
		int ctr = 0;
		while(array[ctr] != null) {
			if(array[ctr].equals(o)) {
				return true;
			}
			ctr++;
		}
		return false;
	}
	
	public Object get(int index) {
		if(index > array.length) {
			return null;
		}
		if(array[index] != null) {
			return array[index];
		}
		return null;
	}
	
	public int indexOf(Object o) {
		int ctr = 0;
		while(array[ctr] != null) {
			if(array[ctr].equals(o)) {
				return ctr;
			}
			ctr++;
		}
		return -1;
	}
	
	public boolean isEmpty() {
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				return false;
			}
		}
		return true;
	}
	
	public int lastIndexOf(Object o) {
		int ctr = array.length-1;
		
		while(array[ctr] == null) {
			ctr--;
			if(ctr < 0) {
				return -1;
			}
		}
		
		while(array[ctr] != null) {
			if(array[ctr].equals(o)) {
				return ctr;
			}
			ctr--;
			if(ctr < 0) {
				return -1;
			}
		}
		return -1;
	}
	
	public boolean remove(Object o) {
		Object[] helper = new Object[array.length-1];
		boolean remove = true;
		int ctr = 0;
		while(array[ctr] != null) {
			if(!array[ctr].equals(o) && remove) {
				helper[ctr] = array[ctr];
			}
			if(array[ctr].equals(o) && remove) {
				remove = false;
			}
			ctr++;
		}
		size--;
		return !remove;
	}
	
	public int size() {
		return this.size;
	}
	
	public Object remove(int index) {
		if(index > array.length) {
			return null;
		}
		Object item = array[index];
		Object[] helper = new Object[array.length-1];
		for(int i = 0; i < array.length-1; i ++) {
			if(i != index) {
				helper[i] = array[i];
			}
		}
		size--;
		return item;
	}
	
	public Object set(int index, Object o) {
		if(index < size) {
			Object item = array[index];
			array[index] = o;
			return item;
		}
		return null;
		
	}
	
	public String toString() {
		String output = "[";
		int ctr = 0;
		if(array[ctr] == null) {
			output += "]";
		}
		while(array[ctr] != null) {
			if(ctr == array.length-1) {
				output += array[ctr] + "]";
			}
			else {
				if(array[ctr+1] == null) {
					output += array[ctr] + "]";
				}
				else {
					output += array[ctr] + ", ";
				}
			}
			ctr++;
		}
		return output;
	}
}
