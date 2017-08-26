package Exception;

public class CatchThrow {

	private static void throwsMethod() throws NumberFormatException {
	    String  intNumber = "5A";
	
	    Integer.parseInt(intNumber);
	}
	
	private static void catchMethod() {
	    try {
	
	        throwsMethod();
	        System.out.println("Yap");
	
	    } catch (NumberFormatException e) {
	        System.out.println("Convertion Error");
	    }
	
	}
	
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	
	    catchMethod();
	}

}
