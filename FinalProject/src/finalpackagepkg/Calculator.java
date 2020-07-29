package finalpackagepkg;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Calculator extends Application {
	
	StackPane stack = new StackPane();
	GridPane grid = new GridPane();
	BorderPane border = new BorderPane();
	HBox h = new HBox();
	
	TextField text = new TextField();
	TextField text2 = new TextField();

	double num1 = 0;
	double num2 = 0;
	double answer = 0;
	String op = " ";
	String result = " ";
	String display = " ";
	
	public int index = 0;
	
	DecimalFormat format = new DecimalFormat("0.#");
	
	Button btn1 = new Button("1");
	Button btn2 = new Button("2");
	Button btn3 = new Button("3");
	Button btn4 = new Button("4");
	Button btn5 = new Button("5");
	Button btn6 = new Button("6");
	Button btn7 = new Button("7");
	Button btn8 = new Button("8");
	Button btn9 = new Button("9");
	Button btn0 = new Button("0");
	Button btnDec = new Button(".");
	
	Button btnMult = new Button("X");
	Button btnSub = new Button("-");
	Button btnAdd = new Button("+");
	Button btnDiv = new Button("÷");
	Button btnPer = new Button("%");
	Button btnEx = new Button("X!");
	Button btnSq = new Button("²✓");
	Button btnCube = new Button("³✓");
	Button btnClear = new Button("Clear");
	Button btnX2 = new Button("X ²");
	Button btnX3 = new Button("X ³");
	Button btnXN = new Button("X ⁿ");
	
	Button btnEqual = new Button("=");
	
	@Override
	public void start(Stage primaryStage)
	{
		setup();
		actions();
		radio();
		
		Scene scene = new Scene(stack, 400,300);
		
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void setup() {
		grid.setHgap(20);
		grid.setVgap(20);
		
		grid.add(btn7, 0, 0);
		grid.add(btn8, 1, 0);
		grid.add(btn9, 2, 0);
		grid.add(btn4, 0, 1);
		grid.add(btn5, 1, 1);
		grid.add(btn6, 2, 1);
		grid.add(btn1, 0, 2);
		grid.add(btn2, 1, 2);
		grid.add(btn3, 2, 2);
		grid.add(btn0, 0, 3);
		grid.add(btnDec, 2, 3);
		
		grid.add(btnMult, 3, 0);
		btnMult.setStyle("-fx-background-color: orange;");
		grid.add(btnPer, 4, 0);
		btnPer.setStyle("-fx-background-color: orange;");
		grid.add(btnClear, 5, 0);
		btnClear.setStyle("-fx-background-color: orange;");
		grid.add(btnSub, 3, 1);
		btnSub.setStyle("-fx-background-color: orange;");
		grid.add(btnEx, 4, 1);
		btnEx.setStyle("-fx-background-color: orange;");
		grid.add(btnX2, 5, 1);
		btnX2.setStyle("-fx-background-color: orange;");
		grid.add(btnAdd, 3, 2);
		btnAdd.setStyle("-fx-background-color: orange;");
		grid.add(btnSq, 4, 2);
		btnSq.setStyle("-fx-background-color: orange;");
		grid.add(btnX3, 5, 2);
		btnX3.setStyle("-fx-background-color: orange;");
		grid.add(btnDiv, 3, 3);
		btnDiv.setStyle("-fx-background-color: orange;");
		grid.add(btnCube, 4, 3);
		btnCube.setStyle("-fx-background-color: orange;");
		grid.add(btnXN, 5, 3);
		btnXN.setStyle("-fx-background-color: orange;");
		
		border.setPadding(new Insets(10));

		GridPane.setHgrow(btn7, Priority.ALWAYS);
		btn7.setPrefWidth(10000);
		GridPane.setHgrow(btn8, Priority.ALWAYS);
		btn8.setPrefWidth(10000);
		GridPane.setHgrow(btn9, Priority.ALWAYS);
		btn9.setPrefWidth(10000);
		GridPane.setHgrow(btn0, Priority.ALWAYS);
		btn0.setPrefWidth(10000);
		GridPane.setHgrow(btn2, Priority.ALWAYS);
		btn2.setPrefWidth(10000);
		GridPane.setHgrow(btn1, Priority.ALWAYS);
		btn1.setPrefWidth(10000);
		GridPane.setHgrow(btn3, Priority.ALWAYS);
		btn3.setPrefWidth(10000);
		GridPane.setHgrow(btn4, Priority.ALWAYS);
		btn4.setPrefWidth(10000);
		GridPane.setHgrow(btn5, Priority.ALWAYS);
		btn5.setPrefWidth(10000);
		GridPane.setHgrow(btn6, Priority.ALWAYS);
		btn6.setPrefWidth(10000);
		GridPane.setHgrow(btnDec, Priority.ALWAYS);
		btnDec.setPrefWidth(10000);
		GridPane.setHgrow(btnMult, Priority.ALWAYS);
		btnMult.setPrefWidth(10000);
		GridPane.setHgrow(btnSub, Priority.ALWAYS);
		btnSub.setPrefWidth(10000);
		GridPane.setHgrow(btnAdd, Priority.ALWAYS);
		btnAdd.setPrefWidth(10000);
		GridPane.setHgrow(btnDiv, Priority.ALWAYS);
		btnDiv.setPrefWidth(10000);
		GridPane.setHgrow(btnX2, Priority.ALWAYS);
		btnX2.setPrefWidth(10000);
		GridPane.setHgrow(btnX3, Priority.ALWAYS);
		btnX3.setPrefWidth(10000);
		GridPane.setHgrow(btnXN, Priority.ALWAYS);
		btnXN.setPrefWidth(10000);
		GridPane.setHgrow(btnSq, Priority.ALWAYS);
		btnSq.setPrefWidth(10000);
		GridPane.setHgrow(btnCube, Priority.ALWAYS);
		btnCube.setPrefWidth(10000);
		GridPane.setHgrow(btnClear, Priority.ALWAYS);
		btnClear.setPrefWidth(10000);
		GridPane.setHgrow(btnPer, Priority.ALWAYS);
		btnPer.setPrefWidth(10000);
		GridPane.setHgrow(btnEx, Priority.ALWAYS);
		btnEx.setPrefWidth(10000);
		
		HBox h1 = new HBox();
		h1.setPadding(new Insets(10));
		HBox.setHgrow(btnEqual, Priority.ALWAYS);
		btnEqual.setPrefWidth(10000);
		h1.getChildren().addAll(btnEqual);
		btnEqual.setStyle("-fx-background-color: orange;");
		
		h.setPadding(new Insets(10));
		HBox.setHgrow(text, Priority.ALWAYS);
		text.setPrefWidth(10000);
		HBox.setHgrow(text2, Priority.ALWAYS);
		text2.setPrefWidth(10000);
		text2.setStyle("-fx-opacity: 1.0;");
		text2.setStyle("-fx-background-color: LIGHTGRAY;");
		h.setAlignment(Pos.CENTER);
		h.getChildren().addAll(text,text2);
		
		HBox h2 = new HBox();
		h2.setPadding(new Insets(10));
		h2.getChildren().addAll(grid);
		HBox.setHgrow(grid, Priority.ALWAYS);
		grid.setPrefWidth(1000);
		grid.setPrefHeight(1000);

		border.setTop(h);
		border.setCenter(h2);
		border.setBottom(h1);
		
		stack.getChildren().addAll(border);
	}
	
	public void practice()
	{
		if(display.length() > 10)
		{
			StackPane pane = new StackPane();
			TextArea text3 = new TextArea();
			text3.setWrapText(true);
			text3.setText(display);
			HBox h5 = new HBox();
			h5.getChildren().addAll(text3);
			HBox.setHgrow(text3, Priority.ALWAYS);
			text3.setPrefWidth(10000);
			pane.getChildren().addAll(h5);
			Scene big = new Scene(pane,200,200);
			Stage newWindow = new Stage();
			newWindow.setTitle("Big Result");
			newWindow.setScene(big);
			newWindow.show();
		}
		else
		{
			text2.setText(display);
		}
	}
	
	public void actions()
	{
		btnEqual.setOnAction(e ->{
			format.setDecimalSeparatorAlwaysShown(false);
			format.format(num1);
			format.format(num2);
			num2 = Double.parseDouble(text.getText());
			
			if(op == "+")
			{
				answer = num1 + num2;
				format.format(answer);
				result= format.format(answer);
				display = format.format(num1) + "+" + format.format(num2) + "=" + result;
			}
			
			if(op == "XN")
			{
				answer =1;
				for(int i = 1; i <= num2 ; i++)
				{
					answer = answer * num1;
				}
				format.format(answer);
				result= format.format(answer);
				display = format.format(num1) + "^" + format.format(num2) + "=" + result;
			}
			
			if(op == "%")
			{
				answer = num1 % num2;
				format.format(answer);
				result= format.format(answer);
				display = format.format(num1) + "%" + format.format(num2) + "=" + result;
			}
			
			if(op == "-")
			{
				answer = num1 - num2;
				format.format(answer);
				result= format.format(answer);
				display = format.format(num1) + "-" + format.format(num2) + "=" + result;
			}
			
			if(op == "*")
			{
				answer = num1 * num2;
				format.format(answer);
				result= format.format(answer);
				display = format.format(num1) + "*" + format.format(num2) + "=" + result;
			}
			
			if(op == "/")
			{
				answer = num1 / num2;
				format.format(answer);
				result= format.format(answer);
				display = format.format(num1) + "/" + format.format(num2) + "=" + result;
			}
			
			if(display.length() > 30)
			{
				
				StackPane pane = new StackPane();
				TextField text3 = new TextField();
				text3.setText(display);
				HBox h5 = new HBox();
				h5.getChildren().addAll(text3);
				HBox.setHgrow(text3, Priority.ALWAYS);
				text3.setPrefWidth(10000);
				pane.getChildren().addAll(h5);
				Scene big = new Scene(pane,200,200);
				Stage newWindow = new Stage();
				newWindow.setTitle("Big Result");
				newWindow.setScene(big);
				newWindow.show();
			}
			if(display.length() < 30)
			{
				//text2.setText(text.getText());
				//text.setText(result);
				text2.setText(display);

			}
		});
		
		btnClear.setOnAction(e ->{
				text.clear();
				text2.clear();
				num1 =0;
				num2=0;
				answer=0;
				display = " ";
				result = " ";
				op = " ";
		});
		
		btn1.setOnAction(e->{
			String enter = text.getText() + btn1.getText();
			text.setText(enter);
		});
		
		btn0.setOnAction(e->{
			String enter = text.getText() + btn0.getText();
			text.setText(enter);
		});
		
		btn3.setOnAction(e->{
			String enter = text.getText() + btn3.getText();
			text.setText(enter);
		});
		
		btn4.setOnAction(e->{
			String enter = text.getText() + btn4.getText();
			text.setText(enter);
		});
		
		btn5.setOnAction(e->{
			String enter = text.getText() + btn5.getText();
			text.setText(enter);
		});
		
		btn6.setOnAction(e->{
			String ee = text.getText() + btn6.getText();
			text.setText(ee);
		});
		
		btn7.setOnAction(e->{
			String ee = text.getText() + btn7.getText();
			text.setText(ee);
		});
		
		btn8.setOnAction(e->{
			String ee = text.getText() + btn8.getText();
			text.setText(ee);
		});
		
		btn9.setOnAction(e->{
			String ee = text.getText() + btn9.getText();
			text.setText(ee);
		});
		
		btn2.setOnAction(e->{
			String ee = text.getText() + btn2.getText();
			text.setText(ee);
		});
		
		btnDec.setOnAction(e->{
			String ee = text.getText() + btnDec.getText();
			text.setText(ee);
		});
		
		btnAdd.setOnAction(e->{
			num1 = Double.parseDouble(text.getText());
			text.setText(" ");
			op = "+";
		});
		
		btnSub.setOnAction(e->{
			num1 = Double.parseDouble(text.getText());
			text.setText(" ");
			op = "-";
		});
		
		btnMult.setOnAction(e->{
			num1 = Double.parseDouble(text.getText());
			text.setText(" ");
			op = "*";
		});
		
		btnDiv.setOnAction(e->{
			num1 = Double.parseDouble(text.getText());
			text.setText(" ");
			op = "/";
		});
		
		btnPer.setOnAction(e->{
			num1 = Double.parseDouble(text.getText());
			text.setText(" ");
			op = "%";
		});
		
		btnEx.setOnAction(e->{
			format.setDecimalSeparatorAlwaysShown(false);
			num1 = Double.parseDouble(text.getText());
			text.setText(" ");
			format.format(num1);
			answer =1;
			for(int i = 1; i <= num1 ; i++)
			{
				answer = answer * i;
			}
			
			result= format.format(answer);
			display = format.format(num1) + "!" + "=" + result;
			practice();
		});
		
		btnCube.setOnAction(e->{
			format.setDecimalSeparatorAlwaysShown(false);
			num1 = Double.parseDouble(text.getText());
			text.setText(" ");
			format.format(num1);
			answer= Math.cbrt(num1);
			result= String.valueOf(BigDecimal.valueOf(answer));
			display = "³✓" + format.format(num1) + "=" + result;
			practice();
		});
		
		btnSq.setOnAction(e->{
			format.setDecimalSeparatorAlwaysShown(false);
			num1 = Double.parseDouble(text.getText());
			text.setText(" ");
			format.format(num1);
			answer= Math.sqrt(num1);
			result= String.valueOf(BigDecimal.valueOf(answer));
			display = "²✓" + format.format(num1) + "=" + result;
			practice();
		});
		
		btnX2.setOnAction(e->{
			format.setDecimalSeparatorAlwaysShown(false);
			num1 = Double.parseDouble(text.getText());
			text.setText(" ");
			format.format(num1);
			answer= num1 * num1;
			result= String.valueOf(format.format(answer));
			display = format.format(num1) + "^" + "2" + "=" + result;
			practice();
		});
		
		btnX3.setOnAction(e->{
			format.setDecimalSeparatorAlwaysShown(false);
			num1 = Double.parseDouble(text.getText());
			text.setText(" ");
			format.format(num1);
			answer= num1 * num1*num1;
			result= String.valueOf(format.format(answer));
			display = format.format(num1) + "^" + "3" + "=" + result;
			practice();
		});
		
		btnXN.setOnAction(e->{
			num1 = Double.parseDouble(text.getText());
			text.setText(" ");
			op = "XN";
		});
	}
	
	public void radio()
	{
		RadioButton o = new RadioButton("Orange");
		RadioButton r = new RadioButton("Red");
		RadioButton b = new RadioButton("Blue");
		RadioButton g = new RadioButton("Green");
		RadioButton y = new RadioButton("Yellow");
		RadioButton p = new RadioButton("Purple");
		
		grid.add(o, 1, 4);
		grid.add(r, 0, 4);
		grid.add(y, 2, 4);
		grid.add(g, 3, 4);
		grid.add(b, 4, 4);
		grid.add(p, 5, 4);

		ToggleGroup tgColors = new ToggleGroup();
		o.setToggleGroup(tgColors);
		r.setToggleGroup(tgColors);
		b.setToggleGroup(tgColors);
		y.setToggleGroup(tgColors);
		p.setToggleGroup(tgColors);
		g.setToggleGroup(tgColors);

		o.setOnAction(e ->{
			btnMult.setStyle("-fx-background-color: orange;");
			btnPer.setStyle("-fx-background-color: orange;");
			btnClear.setStyle("-fx-background-color: orange;");
			btnSub.setStyle("-fx-background-color: orange;");
			btnEx.setStyle("-fx-background-color: orange;");
			btnX2.setStyle("-fx-background-color: orange;");
			btnAdd.setStyle("-fx-background-color: orange;");
			btnSq.setStyle("-fx-background-color: orange;");
			btnX3.setStyle("-fx-background-color: orange;");
			btnDiv.setStyle("-fx-background-color: orange;");
			btnCube.setStyle("-fx-background-color: orange;");
			btnXN.setStyle("-fx-background-color: orange;");
			btnEqual.setStyle("-fx-background-color: orange;");

		});
		
		r.setOnAction(e ->{
			btnMult.setStyle("-fx-background-color: red;");
			btnPer.setStyle("-fx-background-color: red;");
			btnClear.setStyle("-fx-background-color: red;");
			btnSub.setStyle("-fx-background-color: red;");
			btnEx.setStyle("-fx-background-color: red;");
			btnX2.setStyle("-fx-background-color: red;");
			btnAdd.setStyle("-fx-background-color: red;");
			btnSq.setStyle("-fx-background-color: red;");
			btnX3.setStyle("-fx-background-color: red;");
			btnDiv.setStyle("-fx-background-color: red;");
			btnCube.setStyle("-fx-background-color: red;");
			btnXN.setStyle("-fx-background-color: red;");
			btnEqual.setStyle("-fx-background-color: red;");

		});
		
		y.setOnAction(e ->{
			btnMult.setStyle("-fx-background-color: yellow;");
			btnPer.setStyle("-fx-background-color: yellow;");
			btnClear.setStyle("-fx-background-color: yellow;");
			btnSub.setStyle("-fx-background-color: yellow;");
			btnEx.setStyle("-fx-background-color: yellow;");
			btnX2.setStyle("-fx-background-color: yellow;");
			btnAdd.setStyle("-fx-background-color: yellow;");
			btnSq.setStyle("-fx-background-color: yellow;");
			btnX3.setStyle("-fx-background-color: yellow;");
			btnDiv.setStyle("-fx-background-color: yellow;");
			btnCube.setStyle("-fx-background-color: yellow;");
			btnXN.setStyle("-fx-background-color: yellow;");
			btnEqual.setStyle("-fx-background-color: yellow;");

		});
		
		g.setOnAction(e ->{
			btnMult.setStyle("-fx-background-color: green;");
			btnPer.setStyle("-fx-background-color: green;");
			btnClear.setStyle("-fx-background-color: green;");
			btnSub.setStyle("-fx-background-color: green;");
			btnEx.setStyle("-fx-background-color: green;");
			btnX2.setStyle("-fx-background-color: green;");
			btnAdd.setStyle("-fx-background-color: green;");
			btnSq.setStyle("-fx-background-color: green;");
			btnX3.setStyle("-fx-background-color: green;");
			btnDiv.setStyle("-fx-background-color: green;");
			btnCube.setStyle("-fx-background-color: green;");
			btnXN.setStyle("-fx-background-color: green;");
			btnEqual.setStyle("-fx-background-color: green;");

		});
		
		p.setOnAction(e ->{
			btnMult.setStyle("-fx-background-color: purple;");
			btnPer.setStyle("-fx-background-color: purple;");
			btnClear.setStyle("-fx-background-color: purple;");
			btnSub.setStyle("-fx-background-color: purple;");
			btnEx.setStyle("-fx-background-color: purple;");
			btnX2.setStyle("-fx-background-color: purple;");
			btnAdd.setStyle("-fx-background-color: purple;");
			btnSq.setStyle("-fx-background-color: purple;");
			btnX3.setStyle("-fx-background-color: purple;");
			btnDiv.setStyle("-fx-background-color: purple;");
			btnCube.setStyle("-fx-background-color: purple;");
			btnXN.setStyle("-fx-background-color: purple;");
			btnEqual.setStyle("-fx-background-color: purple;");

		});
		
		b.setOnAction(e ->{
			btnMult.setStyle("-fx-background-color: blue;");
			btnPer.setStyle("-fx-background-color: blue;");
			btnClear.setStyle("-fx-background-color: blue;");
			btnSub.setStyle("-fx-background-color: blue;");
			btnEx.setStyle("-fx-background-color: blue;");
			btnX2.setStyle("-fx-background-color: blue;");
			btnAdd.setStyle("-fx-background-color: blue;");
			btnSq.setStyle("-fx-background-color: blue;");
			btnX3.setStyle("-fx-background-color: blue;");
			btnDiv.setStyle("-fx-background-color: blue;");
			btnCube.setStyle("-fx-background-color: blue;");
			btnXN.setStyle("-fx-background-color: blue;");
			btnEqual.setStyle("-fx-background-color: blue;");

		});
		
		Button mode = new Button("Mode");
		grid.add(mode, 1, 3);
		mode.setPrefWidth(10000);
		GridPane.setHgrow(mode, Priority.ALWAYS);
		mode.setStyle("-fx-background-color: gray;");
		String color[] = {"lightgrey", "black", "white"};
		mode.setOnAction(e->{
			index++;
			if(index >= color.length)
			{
				index =0;
			}
			
			if(index == 0)
			{
				border.setStyle("-fx-background-color: ligthgrey;");
			}
			else if(index == 1)
			{
				border.setStyle("-fx-background-color: white;");
			}
			else
			{
				border.setStyle("-fx-background-color: black;");

			}



		});

		
	}
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
