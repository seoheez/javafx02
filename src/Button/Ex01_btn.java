package Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ex01_btn extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Pane canvas = new Pane();
		Button btn = new Button();
		
		btn.setGraphic(new ImageView("/img/smilerere.png"));
		btn.setLayoutX(90); btn.setLayoutY(80);
		
		Button btn02 = new Button();
		ImageView img = new ImageView("/img/smilerere.png");
		img.setFitHeight(40); img.setFitWidth(40);
		
		btn02.setGraphic(img);
		
		btn02.setStyle("-fx-background-color:transparent;-fx-padding:10 10 10 10");
		
		btn02.setOnMousePressed(e->{
			btn02.setStyle("-fx-background-color:transparent;-fx-padding:15 10 10 10");
		});
		btn02.setOnMouseReleased(e->{
			btn02.setStyle("-fx-background-color:transparent;-fx-padding:10 10 10 10");
		});
		btn.setOnAction(e->{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("경~고");
			alert.setHeaderText("버튼 이벤트");
			alert.setContentText("버튼을 클릭했습니다.");
			alert.show();		
			
		});
		
		canvas.getChildren().addAll(btn, btn02);
		canvas.setPrefSize(400, 400);
		
		arg0.setScene(new Scene(canvas));
		arg0.show();
		
	}

}
