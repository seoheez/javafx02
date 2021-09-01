package ToggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex02_tog extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		ToggleButton tb1 = new ToggleButton("111");
		ToggleButton tb2 = new ToggleButton("222");
		ToggleButton tb3 = new ToggleButton("333");
		
		ToggleGroup tg = new ToggleGroup();
		tb1.setToggleGroup(tg);
		tb2.setToggleGroup(tg);
		tb3.setToggleGroup(tg);//그룹으로 묶어주면 tg중에 하나만 선택할 수 있는 설정.
		
		tb2.setSelected(true);
		
		hbox.getChildren().addAll(tb1, tb2, tb3);
		hbox.setPrefSize(300,200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}

}
