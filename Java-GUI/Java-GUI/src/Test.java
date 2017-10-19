import javafx.application.*;
import javafx.stage.*;

public class Test extends Application{

	public Test() {
		System.out.println("Test constructor is invoked");
	}
	
	public void start(Stage primaryStage) {
		System.out.println("Start method is invoked");
	}
	
	public static void main(String[] args) {
		System.out.println("Launch application");
		Application.launch(args);//Test constructor -> start() Ask prof why this happens
	}
}
