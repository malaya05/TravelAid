package edu.orangecoastcollege.view;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;

public class CountryCityScene {

	// Event Listener on Button.onAction
	@FXML
	public void backButton(ActionEvent event) {
		// TODO Autogenerated
	       ViewNavigator.loadScene("User Info", ViewNavigator.USER_INFORMATION_SCENE);

	}
	@FXML
	public void goToChooseScene()
	{
        ViewNavigator.loadScene("User Info", ViewNavigator.CHOOSE_SCENE);

	}
}
