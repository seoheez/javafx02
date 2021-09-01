package Label;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex04 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane anch = new AnchorPane();
		Label lbl = new Label("Value");

		lbl.setFont(new Font(32));
		lbl.setRotate(48);
		lbl.setTranslateX(100);
		lbl.setTranslateY(70);

		EventHandler<MouseEvent> entered = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				lbl.setScaleX(1.5);
				lbl.setScaleY(1.5);
			}
		};

		lbl.setOnMouseEntered(entered);
		
		lbl.setOnMouseExited(new EventHandler<MouseEvent>() {
		
			@Override
			public void handle(MouseEvent arg0) {
				lbl.setScaleX(1.0);
				lbl.setScaleY(1.0);
				
			}
		});

		//lbl.setOnMouseEntered(null);
		//lbl.setOnMouseDragExited(null);

		anch.getChildren().add(lbl);
		anch.setPrefSize(300, 200);
		
//		Scene s = new Scene(anch);
//		arg0.setScene(s);
		arg0.setScene(new Scene(anch));//합쳐서

		arg0.show();

	}

}
