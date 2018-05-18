package edu.orangecoastcollege.view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

import edu.orangecoastcollege.controller.Controller;
import edu.orangecoastcollege.model.Housing;
import javafx.event.ActionEvent;

public class HouseScene implements Initializable 
{

private static Controller controller = Controller.getInstance();
	
	@FXML
	private ListView<Housing>housingLV;

	// Event Listener on Button.onAction
	@FXML
	public void BackToChooseScene(ActionEvent event) {
		// TODO Autogenerated
        ViewNavigator.loadScene("categories", ViewNavigator.CHOOSE_SCENE);

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		housingLV.setItems(controller.getAllHousing());
	}
}
