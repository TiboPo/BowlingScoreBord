package Bowlingscorebord;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class Controller {
    private Spel model;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView snelheid;

    @FXML
    private Label s1f1w1;

    @FXML
    private Label s1f1w2;

    @FXML
    private Label s1f1w3;

    @FXML
    private Label s1f1;

    @FXML
    private Label s1f2w1;

    @FXML
    private Label s1f2w2;

    @FXML
    private Label s1f2w3;

    @FXML
    private Label s1f3w1;

    @FXML
    private Label s1f3w2;

    @FXML
    private Label s1f3w3;

    @FXML
    private Label s1f4w1;

    @FXML
    private Label s1f4w2;

    @FXML
    private Label s1f4w3;

    @FXML
    private Label s1f4;

    @FXML
    private Label s1f2;

    @FXML
    private Label s1f3;

    @FXML
    private Label s1f5w1;

    @FXML
    private Label s1f5w2;

    @FXML
    private Label s1f5w3;

    @FXML
    private Label s1f5;

    @FXML
    private Label s2f1w1;

    @FXML
    private Label s2f1;

    @FXML
    private Label s2f1w2;

    @FXML
    private Label s2f1w3;

    @FXML
    private Label s2f2w1;

    @FXML
    private Label s2f2w2;

    @FXML
    private Label s2f2w3;

    @FXML
    private Label s2f2;

    @FXML
    private Label s2f3w1;

    @FXML
    private Label s2f3w2;

    @FXML
    private Label s2f3w3;

    @FXML
    private Label s2f3;

    @FXML
    private Label s2f4w1;

    @FXML
    private Label s2f4w2;

    @FXML
    private Label s2f4w3;

    @FXML
    private Label s2f4;

    @FXML
    private Label s2f5w1;

    @FXML
    private Label s2f5w2;

    @FXML
    private Label s2f5w3;

    @FXML
    private Label s2f5;

    @FXML
    private Label s1f6w1;

    @FXML
    private Label s1f6w2;

    @FXML
    private Label s1f6w3;

    @FXML
    private Label s2f6w1;

    @FXML
    private Label s2f6w2;

    @FXML
    private Label s2f6w3;

    @FXML
    private Label s2f6;

    @FXML
    private Label s2f7w1;

    @FXML
    private Label s2f7w2;

    @FXML
    private Label s2f7w3;

    @FXML
    private Label s2f7;

    @FXML
    private Label s1f6;

    @FXML
    private Label s1f7w1;

    @FXML
    private Label s1f7w2;

    @FXML
    private Label s1f7w3;

    @FXML
    private Label s1f7;

    @FXML
    private Label s1f8w1;

    @FXML
    private Label s1f8w2;

    @FXML
    private Label s1f8w3;

    @FXML
    private Label s2f8w1;

    @FXML
    private Label s2f8w2;

    @FXML
    private Label s2f8w3;

    @FXML
    private Label s2f8;

    @FXML
    private Label s2f9w1;

    @FXML
    private Label s2f9w2;

    @FXML
    private Label s2f9w3;

    @FXML
    private Label s2f9;

    @FXML
    private Label s1f8;

    @FXML
    private Label s1f9w1;

    @FXML
    private Label s1f9w2;

    @FXML
    private Label s1f9w3;

    @FXML
    private Label s1f9;

    @FXML
    private Label s1;

    @FXML
    private Label s2f10w1;

    @FXML
    private Label s2f10w2;

    @FXML
    private Label s2f10w3;

    @FXML
    private Label s1f10w1;

    @FXML
    private Label s1f10w2;

    @FXML
    private Label s1f10w3;

    @FXML
    private Label s3f1w1;

    @FXML
    private Label s3f1w2;

    @FXML
    private Label s3f1w3;

    @FXML
    private Label s3f1;

    @FXML
    private Label s3f2w1;

    @FXML
    private Label s3f2w2;

    @FXML
    private Label s3f2w3;

    @FXML
    private Label s3f2;

    @FXML
    private Label s3f3w1;

    @FXML
    private Label s3f3w2;

    @FXML
    private Label s3f3;

    @FXML
    private Label s3f3w3;

    @FXML
    private Label s3f4w1;

    @FXML
    private Label s3f4w2;

    @FXML
    private Label s3f4w3;

    @FXML
    private Label s3f4;

    @FXML
    private Label s3f5w1;

    @FXML
    private Label s3f5w2;

    @FXML
    private Label s3f5w3;

    @FXML
    private Label s3f5;

    @FXML
    private Label s3f6w1;

    @FXML
    private Label s3f6w2;

    @FXML
    private Label s3f6w3;

    @FXML
    private Label s3f6;

    @FXML
    private Label s3f7w1;

    @FXML
    private Label s3f7w2;

    @FXML
    private Label s3f7;

    @FXML
    private Label s3f7w3;

    @FXML
    private Label s3f8w1;

    @FXML
    private Label s3f8w2;

    @FXML
    private Label s3f8;

    @FXML
    private Label s3f9w1;

    @FXML
    private Label s3f8w3;

    @FXML
    private Label s3f9;

    @FXML
    private Label s3f10w1;

    @FXML
    private Label s3f10w2;

    @FXML
    private Label s3f10w3;

    @FXML
    private Label s4f9;

    @FXML
    private Label s4f9w1;

    @FXML
    private Label s4f9w2;

    @FXML
    private Label s4f9w3;

    @FXML
    private Label s4f1w1;

    @FXML
    private Label s4f1w2;

    @FXML
    private Label s4f1w3;

    @FXML
    private Label s4f1;

    @FXML
    private Label s4f2w1;

    @FXML
    private Label s4f2w2;

    @FXML
    private Label s4f2w3;

    @FXML
    private Label s4f2;

    @FXML
    private Label s4f3w1;

    @FXML
    private Label s4f3w2;

    @FXML
    private Label s4f3w3;

    @FXML
    private Label s4f3;

    @FXML
    private Label s4f4w1;

    @FXML
    private Label s4f4w2;

    @FXML
    private Label s4f4;

    @FXML
    private Label s4f4w3;

    @FXML
    private Label s4f5w1;

    @FXML
    private Label s4f5w2;

    @FXML
    private Label s4f5w3;

    @FXML
    private Label s4f5;

    @FXML
    private Label s4f6w1;

    @FXML
    private Label s4f6w2;

    @FXML
    private Label s4f6;

    @FXML
    private Label s4f6w3;

    @FXML
    private Label s4f7w1;

    @FXML
    private Label s4f7w2;

    @FXML
    private Label s4f7;

    @FXML
    private Label s4f8w1;

    @FXML
    private Label s4f8w2;

    @FXML
    private Label s4f8;

    @FXML
    private Label s4f8w3;

    @FXML
    private Label s4f10w1;

    @FXML
    private Label s4f1àw2;

    @FXML
    private Label s4f10w3;

    @FXML
    private Label s5f1w1;

    @FXML
    private Label s5f1w2;

    @FXML
    private Label s5f1;

    @FXML
    private Label s5f1w3;

    @FXML
    private Label s5f2w1;

    @FXML
    private Label s5f2w2;

    @FXML
    private Label s5f2;

    @FXML
    private Label s5f2w3;

    @FXML
    private Label s5f3w1;

    @FXML
    private Label s5f3w2;

    @FXML
    private Label s5f3w3;

    @FXML
    private Label s5f3;

    @FXML
    private Label s5f4w1;

    @FXML
    private Label s5f4w2;

    @FXML
    private Label s5f4w3;

    @FXML
    private Label s5f4;

    @FXML
    private Label s5f5w1;

    @FXML
    private Label s5f5w2;

    @FXML
    private Label s5f5w3;

    @FXML
    private Label s5f5;

    @FXML
    private Label s5f6w1;

    @FXML
    private Label s5f6w2;

    @FXML
    private Label s5f6w3;

    @FXML
    private Label s5f6;

    @FXML
    private Label s5f7w1;

    @FXML
    private Label s5f7w2;

    @FXML
    private Label s5f7;

    @FXML
    private Label s5f7w3;

    @FXML
    private Label s5f8w1;

    @FXML
    private Label s5f8w2;

    @FXML
    private Label s5f8w3;

    @FXML
    private Label s5f8;

    @FXML
    private Label s5f9w1;

    @FXML
    private Label s5f9w2;

    @FXML
    private Label s5f9w3;

    @FXML
    private Label s5f9;

    @FXML
    private Label s5f10w1;

    @FXML
    private Label s5f10w2;

    @FXML
    private Label s5f10w3;

    @FXML
    private Label s6f1w1;

    @FXML
    private Label s6f1w2;

    @FXML
    private Label s6f1w3;

    @FXML
    private Label s6f1;

    @FXML
    private Label s6f2w1;

    @FXML
    private Label s6f2w2;

    @FXML
    private Label s6f2w3;

    @FXML
    private Label s6f2;

    @FXML
    private Label s6f3w1;

    @FXML
    private Label s6f3w2;

    @FXML
    private Label s6f3w3;

    @FXML
    private Label s6f3;

    @FXML
    private Label s6f4w1;

    @FXML
    private Label s6f4w2;

    @FXML
    private Label s6f4w3;

    @FXML
    private Label s6f4;

    @FXML
    private Label s6f5w1;

    @FXML
    private Label s6f5w2;

    @FXML
    private Label s6f5;

    @FXML
    private Label s6f5w3;

    @FXML
    private Label s6f6w1;

    @FXML
    private Label s6f6w2;

    @FXML
    private Label s6f6w3;

    @FXML
    private Label s6f6;

    @FXML
    private Label s6f7w1;

    @FXML
    private Label s6f7w2;

    @FXML
    private Label s6f7;

    @FXML
    private Label s6f7w3;

    @FXML
    private Label s6f8w1;

    @FXML
    private Label s6f8w2;

    @FXML
    private Label s6f8;

    @FXML
    private Label s6f8w3;

    @FXML
    private Label s6f9w1;

    @FXML
    private Label s6f9w2;

    @FXML
    private Label s6f9w3;

    @FXML
    private Label s6f9;

    @FXML
    private Label s6f10w1;

    @FXML
    private Label s6f10w2;

    @FXML
    private Label s6f10w3;
    
    @FXML
    private AnchorPane bord;
    
    void initialize() {
        bord.setFocusTraversable(true);
        bord.setOnKeyPressed(this::bowl);
    }

    public void setModel(Spel model) {
        this.model = model;
        Timertask timertask = new Timertask(model,this);
        Timer t = new Timer();
        t.scheduleAtFixedRate(timertask,0,50);
    }
    public void update() {
        //System.out.println("controller update");
        
    }
    public void bowl(KeyEvent e){
        switch(e.getCode()){
            case LEFT:
                System.out.println("links");
                update();
                break;
            case RIGHT:
                System.out.println("rechts");
                update();
                break;
            case UP:
                System.out.println("boven");
                update();
                break;
            case DOWN:
                System.out.println("beneden");
                update();
                break;
        }
}
}
        