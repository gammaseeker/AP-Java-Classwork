package hw4;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;

public class Calculator extends Application {
	private TextField number1 = new TextField();
	private TextField number2 = new TextField();
	private Label result = new Label();

	private Button add = new Button("Add");
	private Button subtract = new Button("Subtract");
	private Button multiply = new Button("Multiply");
	private Button divide = new Button("Divide");

	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		gridPane.add(new Label("Number 1:"), 0, 0);
		gridPane.add(number1, 1, 0);
		gridPane.add(new Label("Number 2:"), 2, 0);
		gridPane.add(number2, 3, 0);
		gridPane.add(new Label("Result:"), 4, 0);
		gridPane.add(result, 5, 0);
		gridPane.add(add, 0, 1);
		gridPane.add(subtract, 1, 1);
		gridPane.add(multiply, 2, 1);
		gridPane.add(divide, 3, 1);

		add.setOnAction(e -> operation("+"));
		subtract.setOnAction(e -> operation("-"));
		multiply.setOnAction(e -> operation("*"));
		divide.setOnAction(e -> operation("/"));

		Scene scene = new Scene(gridPane, 800, 150);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void operation(String op) {
		double number1d = Double.parseDouble(number1.getText());
		double number2d = Double.parseDouble(number2.getText());
		switch(op){
		case "+": result.setText(String.format("%.2f", number1d + number2d)); 
		case "-": result.setText(String.format("%.2f", number1d - number2d)); 
		case "*": result.setText(String.format("%.2f", number1d * number2d)); 
		default: result.setText(String.format("%.2f", number1d / number2d)); 
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

