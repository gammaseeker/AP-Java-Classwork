package gui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyFirstJavaFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btOk = new Button("OK");
		Scene scene = new Scene(btOk, 200, 250);
		primaryStage.setTitle("MyJavaFX");
		primaryStage.setScene(scene); //Place scene in stage
		primaryStage.show(); //Display stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}
