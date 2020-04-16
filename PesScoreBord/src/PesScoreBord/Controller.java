package PesScoreBord;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label score;

    @FXML
    void initialize() {
        assert score != null : "fx:id=\"score\" was not injected: check your FXML file 'FXMLView.fxml'.";

    }
}