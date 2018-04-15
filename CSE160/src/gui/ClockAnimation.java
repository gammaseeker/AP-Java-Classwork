package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
public class ClockAnimation extends Application {
  @Override 
  public void start(Stage primaryStage) {
    ClockPane clock = new ClockPane(); // Create a clock
    // Create a handler for animation
    EventHandler<ActionEvent> eventHandler = e -> clock.setCurrentTime();
    // Create an animation for a running clock
    Timeline animation = new Timeline(
      new KeyFrame(Duration.millis(1000), eventHandler));
    animation.setCycleCount(Timeline.INDEFINITE);
    animation.play();
    Scene scene = new Scene(clock, 250, 250);
    primaryStage.setTitle("ClockAnimation"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }
  public static void main(String[] args) { launch(args); }
}
class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;
    // Clock pane's width and height
    private double w = 250, h = 250;
    public ClockPane() {
        setCurrentTime();
    }
    public void setCurrentTime() {
        Calendar calendar = new GregorianCalendar();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
        paintClock(); // Repaint the clock
    }
    private void paintClock() {
        // Initialize clock parameters
        double clockRadius = Math.min(w, h) * 0.8 * 0.5;
        double centerX = w / 2;
        double centerY = h / 2;
        // Draw circle
        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
        Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
        Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
        Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
        // Draw second hand
        double sLength = clockRadius * 0.8;
        double secondX = centerX + sLength*Math.sin(second * (2 * Math.PI / 60));
        double secondY = centerY - sLength*Math.cos(second * (2 * Math.PI / 60));
        Line sLine = new Line(centerX, centerY, secondX, secondY);
        sLine.setStroke(Color.RED);
        // Draw minute hand
        double mLength = clockRadius * 0.65;
        double xMinute = centerX + mLength*Math.sin(minute * (2 * Math.PI / 60));
        double minuteY = centerY - mLength*Math.cos(minute * (2 * Math.PI / 60));
        Line mLine = new Line(centerX, centerY, xMinute, minuteY);
        mLine.setStroke(Color.BLUE);
        // Draw hour hand
        double hLength = clockRadius * 0.5;
        double hourX = centerX + hLength
                * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        double hourY = centerY - hLength
                * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        Line hLine = new Line(centerX, centerY, hourX, hourY);
        hLine.setStroke(Color.GREEN);
        getChildren().clear();
        getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);
    }
}

