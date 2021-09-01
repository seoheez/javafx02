package Label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01_la extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		Label lbl = new Label("lbl test");
		hbox.getChildren().addAll(lbl);
		
		hbox.setPrefSize(300, 200);
		hbox.setStyle("-fx-background-color:green");
		
		lbl.setPrefSize(200, 30);
		lbl.setStyle("-fx-background-color:yellow");
		lbl.setAlignment(Pos.CENTER_RIGHT);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
		
		
		
	}

}
