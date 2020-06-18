package com.karam.invoice;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public ConnectionModel connectionModel = new ConnectionModel();
    @FXML
    private Label isConnected;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        if(connectionModel.isDBConnected())
        {
            isConnected.setText("Connected");
        }
        else
        {
            isConnected.setText("Not Connected");

        }
    }
}
