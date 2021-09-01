package Radio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01_ra extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox(10);
		RadioButton rd1 = new RadioButton("rb1");
		RadioButton rd2 = new RadioButton("rb2");
		
		hbox.getChildren().addAll(rd1, rd2);
		hbox.setPrefSize(300, 200);
		
		ToggleGroup tg = new ToggleGroup();
		rd1. setToggleGroup(tg);
		rd1.setToggleGroup(tg);
		
		rd1.setText("10대");//선택 되어진 상태로 만들기
		rd1.setSelected(true);
		
		hbox.setPadding(new Insets(20));//안쪽으로 여백을 주는 것.
		hbox.setStyle("-fx-background-color:skyblue");
		
		HBox.setMargin(rd2, new Insets(50, 20, 20, 50));//바깥쪽으로 여백을 주는 것.
		
		arg0.setScene(new Scene(hbox));
		
		arg0.show();
		
	}

}
