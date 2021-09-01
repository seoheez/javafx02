package Label;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex03_la extends Application{
	static int i=0;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		
		Label lbl = new Label("A label that needs to be wrapped");
		hbox.getChildren().add(lbl);
		hbox.setPrefSize(100, 100);
		
		/* 글씨고정
		FlowPane fp = new FlowPane();
		fp.getChildren().add(lbl);
		hbox.setPrefSize(100, 100);
		*/
		lbl.setWrapText(true);//틀 안에 글씨
		lbl.setFont(new Font(20));//글씨 크기
		lbl.setRotate(48);//기울임
		lbl.setTranslateY(100);//글자를 내려줌.
	
		/*
		EventHandler<MouseEvent> e = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				if(i==0) {
					lbl.setRotate(0);
					lbl.setTranslateY(0);
					i=1;
				} else {
					lbl.setRotate(45);
					lbl.setTranslateY(50);
					i=0;
				}
				
			}
		};
		lbl.setOnMouseClicked(e);
		*/
		
		//위와 같은 결과이지만 비교적 간결함.
		lbl.setOnMouseClicked(e-> {
			if(i==0) {
				lbl.setRotate(0);
				lbl.setTranslateY(0);
				i=1;
			} else {
				lbl.setRotate(45);
				lbl.setTranslateY(50);
				i=0;
			}
		});
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
}
