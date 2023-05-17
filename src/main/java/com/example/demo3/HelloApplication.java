package com.example.demo3;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        GridPane grid=new GridPane();
        Text welcomeText=new Text("BMI Calculator");
        Slider weightPicker=new Slider(5,200,5);
//        weightPicker.setOrientation(Orientation.VERTICAL);
        grid.add(weightPicker,0,1);
        Button btn=new Button("Calculate");

 /*weightPicker.setOnMouseDragged(new EventHandler<MouseEvent>() {
     @Override
     public void handle(MouseEvent mouseEvent) {

     }
 });*/
        weightPicker.setOnMouseDragged(event -> btn.setText(String.valueOf(weightPicker.getValue())));


        btn.setOnAction(actionEvent -> System.out.println("Button clicked"));
        grid.add(btn,0,2);
        Scene scene = new Scene(grid, 320, 240);
        grid.add(welcomeText,0,0);
        grid.setPadding(new Insets(15,15,15,15));
        grid.setHgap(10);
        grid.setHgap(8);
        stage.setTitle("BMI Calculator!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}