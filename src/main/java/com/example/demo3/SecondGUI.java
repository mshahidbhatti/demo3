package com.example.demo3;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SecondGUI extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane=new Pane();
        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle(40);
        circle.setFill(Color.RED);
        rectangle.setWidth(40);
        rectangle.setHeight(20);

        pane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                circle.setCenterX(mouseEvent.getX());
                circle.setLayoutY(mouseEvent.getY());
                rectangle.setFill(Color.rgb(150,200,100));
            }
        });
        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);
        Scene scene=new Scene(pane,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
