package Exception;

public class TestCircleWithException {
	public static void main(String[] args){
		try{
			CircleWithException c1 = new CircleWithException(5);
			CircleWithException c2 = new CircleWithException(-5);
			CircleWithException c3 = new CircleWithException(0);
		}
		catch(IllegalArgumentException ex){
			System.out.println(ex);
		}
		
		System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
		
		try {
				int[] list = new int[10];
				System.out.println("list[10] is " + list[10]);
			}
			catch (ArithmeticException ex) {
				System.out.println("ArithmeticException");
			}
			catch (RuntimeException ex) {
				System.out.println("RuntimeException");
			}
			catch (Exception ex) {
				System.out.println("Exception");
			}
		
		try {
				method();
				System.out.println("After the method call");
			}
			catch (ArithmeticException ex) {
				System.out.println("ArithmeticException");
			}
			catch (RuntimeException ex) {
				System.out.println("RuntimeException");
			}
			catch (Exception e) {
				System.out.println("Exception");
			}
		
		try {
				method2();
				System.out.println("After the method call");
			}
			catch (RuntimeException ex) {
				System.out.println("RuntimeException in main");
			}
			catch (Exception ex) {
				System.out.println("Exception in main");
			}
	}
	
	public static void method() throws Exception {
		System.out.println(1 / 0);
	}
	
	public static void method2() throws Exception {
		try {
			String s = "abc";
			System.out.println(s.charAt(3));
		}
		catch (RuntimeException ex) {
			System.out.println("RuntimeException in method2()");
		}
		catch (Exception ex) {
			System.out.println("Exception in method()");
		}
	}
	
	public void m(int value) {
		if (value < 40)
			throw new IllegalArgumentException("value is too small");
	}
}
