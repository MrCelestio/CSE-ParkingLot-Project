package gui;





import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import vehicles.*;


public class Main extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("ParkingLot Interface");
		
		//Initial Pane Setup
		VBox mainPane = new VBox();
		mainPane.setSpacing(25);
		HBox parkingRepresentation = new HBox();
		
		parkingRepresentation.setSpacing(100);
		
		VBox smallParkingZone = new VBox();
		smallParkingZone.setAlignment(Pos.CENTER);
		smallParkingZone.setSpacing(25);
		
		VBox mediumParkingZone = new VBox();
		mediumParkingZone.setAlignment(Pos.CENTER);
		mediumParkingZone.setSpacing(25);
		
		VBox largeParkingZone = new VBox();
		largeParkingZone.setAlignment(Pos.CENTER);
		largeParkingZone.setSpacing(25);
		
		VBox extraLargeParkingZone = new VBox();
		extraLargeParkingZone.setAlignment(Pos.CENTER);
		extraLargeParkingZone.setSpacing(25);
		
		HBox infoPane = new HBox();
		GridPane inputBox = new GridPane();
		inputBox.setPadding(new Insets(10, 10, 10, 10));
		inputBox.setVgap(8);
		inputBox.setHgap(10);
		
		HBox bottomPane = new HBox();
		bottomPane.setAlignment(Pos.CENTER);
		bottomPane.setSpacing(25);
		
		// Button Setup
		Button buttonA1 = new Button();
		buttonA1.setText("A1");
		Button buttonA2 = new Button();
		buttonA2.setText("A2");
		Button buttonA3 = new Button();
		buttonA3.setText("A3");
		Button buttonA4 = new Button();
		buttonA4.setText("A4");
		Button buttonA5 = new Button();
		buttonA5.setText("A5");
		smallParkingZone.getChildren().add(buttonA1);
		smallParkingZone.getChildren().add(buttonA2);
		smallParkingZone.getChildren().add(buttonA3);
		smallParkingZone.getChildren().add(buttonA4);
		smallParkingZone.getChildren().add(buttonA5);
		
		
		Button buttonB1 = new Button();
		buttonB1.setText("B1");
		Button buttonB2 = new Button();
		buttonB2.setText("B2");
		Button buttonB3 = new Button();
		buttonB3.setText("B3");
		Button buttonB4 = new Button();
		buttonB4.setText("B4");
		Button buttonB5 = new Button();
		buttonB5.setText("B5");
		mediumParkingZone.getChildren().addAll(buttonB1, buttonB2, buttonB3, buttonB4, buttonB5);
		
		Button buttonC1 = new Button();
		buttonC1.setText("C1");
		Button buttonC2 = new Button();
		buttonC2.setText("C2");
		Button buttonC3 = new Button();
		buttonC3.setText("C3");
		Button buttonC4 = new Button();
		buttonC4.setText("C4");
		Button buttonC5 = new Button();
		buttonC5.setText("C5");
		largeParkingZone.getChildren().addAll(buttonC1, buttonC2, buttonC3, buttonC4, buttonC5);
		
		Button buttonD1 = new Button();
		buttonD1.setText("D1");
		Button buttonD2 = new Button();
		buttonD2.setText("D2");
		Button buttonD3 = new Button();
		buttonD3.setText("D3");
		Button buttonD4 = new Button();
		buttonD4.setText("D4");
		Button buttonD5 = new Button();
		buttonD5.setText("D5");
		extraLargeParkingZone.getChildren().addAll(buttonD1, buttonD2, buttonD3, buttonD4, buttonD5);
		
//		Button for parking
		Button parkVehicleButton = new Button("Park");
		
//		Button for Retrieving car and exiting
		
		Button retrieveButton = new Button("Retrieve");
		Button exitButton = new Button("exit");
		
		bottomPane.getChildren().addAll(retrieveButton, exitButton);
		
		// Setup for text boxes on input section
		TextField carNameField = new TextField();
		Label carNameLabel = new Label("Vehicle Name  :");
		TextField carLicenseField = new TextField();
		Label carLicenseLabel = new Label("License  :");
		
		Label carSizeLabel = new Label("Size  :");
		inputBox.add(carNameLabel, 1, 1);
		inputBox.add(carNameField, 2, 1);
		inputBox.add(carLicenseLabel, 1, 2);
		inputBox.add(carLicenseField, 2, 2);
		inputBox.add(carSizeLabel, 1, 3);
		inputBox.add(parkVehicleButton, 2, 4);
		
		// ComboBox setup
		ComboBox carSizeInput = new ComboBox();
		
		
		ObservableList<String> sizes = FXCollections.observableArrayList( 
				"Small",
				"Medium",
				"Large",
				"Extra Large"
				
				);
		carSizeInput.setItems(sizes);
		
		inputBox.add(carSizeInput, 2, 3);
		
		// Right side TextArea box that displays information
		TextArea textArea = new TextArea("{[ Info ]}");
		textArea.setWrapText(true);
		textArea.setMaxSize(300, 175);
		
		
		// combines all panes into stage display
		parkingRepresentation.getChildren().addAll(smallParkingZone, mediumParkingZone, largeParkingZone, extraLargeParkingZone);
		infoPane.getChildren().add(inputBox);
		infoPane.getChildren().add(textArea);
		mainPane.getChildren().addAll(infoPane,parkingRepresentation, bottomPane);
		Scene scene = new Scene(mainPane, 600, 600);
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
