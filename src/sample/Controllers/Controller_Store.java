package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller_Store implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private ImageView logoView;

    @FXML
    private Button purshaseButton;

    @FXML
    private Button helpButton;

    @FXML
    private Button cancelButton;

    @FXML
    void handleCancel(ActionEvent event) {

    }

    @FXML
    void handleCheckout(ActionEvent event) {

    }

    @FXML
    void handleHelp(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}