package Quiz;
/*A retail company must file a monthly sales tax report listing the total sales for the month, 
 * and the amount of state and county sales tax collected. 
 * The state sales tax rate is 4% and the county sales tax rate is 2%. 
 * Create a GUI application that allows the user to enter the total sales for the month into a text field. 
 * From this figure, the application should calculate and display the following: 
	The amount of county sales tax 
	The amount of state sales tax 
	The total sales tax (county plus state) 
In the application’s code, represent the county tax rate (0.02) and the state tax rate (0.04) as named constants.

 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.TextFormatter;

public class MonthlySalesTax extends Application {

	private TextField enterSales = new TextField();
	private TextField cSales = new TextField();
	private TextField sSales = new TextField();
	private TextField totalSales = new TextField();
	private Button calcTax = new Button("Calculate");
	public Button clearAll = new Button("Clear");
	final double stateTax = .02;
	final double countyTax = .04;
	
	public void start(Stage window) {
		//Create UI
		GridPane gPane = new GridPane();
		
		gPane.add(new Label("Enter Sales For The Month:"), 0, 0);
		gPane.add(enterSales, 1, 0);
		gPane.add(new Label("County Sales Tax:"), 0, 1);
		gPane.add(cSales, 1, 1);
		gPane.add(new Label("State Tax:"), 0, 2);
		gPane.add(sSales, 1, 2);
		gPane.add(new Label("Total Sales Tax:"), 0, 3);
		gPane.add(totalSales, 1, 3);
		gPane.add(calcTax, 1, 4);
		gPane.add(clearAll, 1, 4);
		gPane.setVgap(5);
		gPane.setHgap(5);
		gPane.setAlignment(Pos.CENTER);
		gPane.setHalignment(calcTax, HPos.RIGHT);
		
		
		////Set properties for UI
		gPane.setStyle("-fx-border-color:black");
		enterSales.setAlignment(Pos.BOTTOM_RIGHT);
		cSales.setAlignment(Pos.BOTTOM_RIGHT);
		sSales.setAlignment(Pos.BOTTOM_RIGHT);
		totalSales.setAlignment(Pos.BOTTOM_RIGHT);
		cSales.setEditable(false);
		sSales.setEditable(false);
		totalSales.setEditable(false);
		clearAll.setOnAction(e -> {
			enterSales.clear();
			cSales.clear();
			sSales.clear();
			totalSales.clear();
		});
		calcTax.setOnAction(e -> getAllAmounts());
		enterSales.setPromptText("Enter Sales Here...");
		enterSales.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.ENTER) {
				getAllAmounts();
			}
		});
		enterSales.setTextFormatter(new TextFormatter<> (change -> 
		(change.getControlNewText().matches("([0-9][1-9]*)?")) ? change : null ));
		enterSales.setTextFormatter(new TextFormatter<> (change -> (change.getControlNewText().matches("\\d*|\\d+\\.\\d*")) ? change:null));
		
		Scene scene = new Scene(gPane, 400, 400);
		window.setTitle("Monthly Sales Tax");
		window.setScene(scene);
		window.show();
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void getAllAmounts() {
		
		double sales = Double.parseDouble(enterSales.getText());
		
		double fullAmount = sales * 1.04 * 1.02;
		
		totalSales.setText(String.format("%.2f", fullAmount));
		
		
		sSales.setText(String.format("%.2f", fullAmount * countyTax));
		cSales.setText(String.format("%.2f", fullAmount * stateTax));
		
	}//END OF METHOD
	
	
}//THIS APPLICATION WAS BUILT FROM SCRATCH BY KENNEDY N***E and KENNEDY N***E ONLY. 3513
