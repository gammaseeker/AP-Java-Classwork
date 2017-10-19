
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.*;

public class NodeStyleRotateDemo extends Application{

	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		Button btOK = new Button("OK");
		btOK.setStyle("-fx-border-color: blue; -fx-color: red;");
		pane.getChildren().add(btOK);
		
		pane.setRotate(45);
		pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");
		
		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("Node Style Rotation Demo");
		primaryStage.setScene(scene);
	
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
