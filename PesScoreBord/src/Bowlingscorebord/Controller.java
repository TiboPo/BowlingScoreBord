package Bowlingscorebord;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import javafx.fxml.FXML;

public class Controller {
    
    private Spel model;
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    void initialize() {
    }

    public void setModel(Spel model) {
        this.model = model;
        Timertask timertask = new Timertask(model,this);
        Timer t = new Timer();
        t.scheduleAtFixedRate(timertask,0,50);
    }
    public void update() {
        
    }
}