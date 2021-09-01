package Textfield;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01_tf extends Application{


	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		TextField tf = new TextField();
		tf.setText("test");//내용이 들어옴.
		
		hbox.setPadding(new Insets(20));
		
		PasswordField pf = new PasswordField();
		pf.setText("abcd1234");//내용이 가려짐.
		
		ComboBox<String> cb = new ComboBox<String>();
		cb.getItems().addAll("공부", "놀기", "멍타기");
		cb.setValue("공부");
		
		TextArea ta = new TextArea();
		ta.setPrefSize(100, 30);
		
		DatePicker dp = new DatePicker();
		
		tf.setPrefSize(100, 30);//고정 된 것처럼 보이지만 안됨.
		FlowPane pp = new FlowPane();
		pp.getChildren().add(tf);//tf를 팬으로 감싸서 넣어주면 크기가 고정됨.
		pp.setPrefSize(150, 20);
		
		hbox.getChildren().addAll(pp, pf, cb, ta, dp);
		hbox.setPrefSize(1000,200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
