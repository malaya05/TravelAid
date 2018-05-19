package edu.orangecoastcollege.view;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;

public class ChooseScene {
	@FXML
	private Button foodButton;
	@FXML
	private Button TransportationButton;
	@FXML
	private Button RealEstate;
	@FXML
	private Button Back;

	// Event Listener on Button[#foodButton].onAction
	@FXML
	public void FoodButtonTrans(ActionEvent event) {
		// TODO Autogenerated
        ViewNavigator.loadScene("Food", ViewNavigator.FOOD_SCENE);

	}
	// Event Listener on Button[#TransportationButton].onAction
	@FXML
	public void TransportationButtonTrans(ActionEvent event) {
		// TODO Autogenerated
        ViewNavigator.loadScene("Transportation", ViewNavigator.TRANSPORTATION_SCENE);

	}
	// Event Listener on Button[#RealEstate].onAction
	@FXML
	public void housingButtonTrans(ActionEvent event) {
		// TODO Autogenerated
        ViewNavigator.loadScene("Housing", ViewNavigator.HOUSE_SCENE);

	}
	// Event Listener on Button[#Back].onAction
	@FXML
	public void backToCountryButton(ActionEvent event) {
		// TODO Autogenerated
        ViewNavigator.loadScene("Choose Country", ViewNavigator.COUNTRY_CITY_SCENE);

	}
	@FXML
	public void resultButton(ActionEvent event) {
		// TODO Autogenerated
        ViewNavigator.loadScene("Result", ViewNavigator.Email);

	}
}
