package ToggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01_tog extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		ToggleButton toggleBtn = new ToggleButton("Toggle Button");
		
		hbox.getChildren().addAll(toggleBtn);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		
		arg0.show();
		
	}

}
