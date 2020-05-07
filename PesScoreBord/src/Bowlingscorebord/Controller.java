package Bowlingscorebord;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView snelheid;

    @FXML
    private Text naamTekst;

    @FXML
    private TextField naam;

    @FXML
    private Button okKnop;

    @FXML
    private Text speler2;

    @FXML
    private Text speler1;

    @FXML
    private Text speler3;

    @FXML
    private Text speler4;

    @FXML
    private Text speler5;

    @FXML
    private Text speler6;

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
    private Button resetKnop;

    @FXML
    private Label snelheidLabel;

    @FXML
    private Label eindScore1;

    @FXML
    private Label eindScore2;

    @FXML
    private Label eindScore3;

    @FXML
    private Label eindScore4;

    @FXML
    private Label eindScore5;

    @FXML
    private Label eindScore6;

    Spel model;
    
    @FXML
    void initialize() {
        resetKnop.setVisible(false);
        okKnop.setOnMousePressed(evt -> model.addSpeler(naam.getText()));
        resetKnop.setOnMousePressed(evt -> reset());
      
    }

    public void setModel(Spel model) {
        this.model = model;
        Timertask timertask = new Timertask(model,this);
        Timer t = new Timer();
        t.scheduleAtFixedRate(timertask,0,50);
    }
    public void update() {
        spelerUpdate();
        frameUpdate();
    }
    public void spelerUpdate() {
        if (model.getSpelers().size() == 6) {
            speler1.setText(model.getSpelers().get(0).getNaam());
            speler2.setText(model.getSpelers().get(1).getNaam());
            speler3.setText(model.getSpelers().get(2).getNaam());
            speler4.setText(model.getSpelers().get(3).getNaam());
            speler5.setText(model.getSpelers().get(4).getNaam());
            speler6.setText(model.getSpelers().get(5).getNaam());
            naam.setVisible(false);
            okKnop.setVisible(false);
            naamTekst.setVisible(false);
            resetKnop.setVisible(true);
        } else {
            speler1.setText("");
            speler2.setText("");
            speler3.setText("");
            speler4.setText("");
            speler5.setText("");
            speler6.setText("");
        }
    }
    public void reset() {
        naam.setVisible(true);
        okKnop.setVisible(true);
        naamTekst.setVisible(true);
        resetKnop.setVisible(false);
        model.resetSpel();
    }
    public void frameUpdate() {
        if (model.getInput().isActief() == false && model.getInput().getTijd() > 0 && model.getSpelers().size() == 6) {
        snelheidLabel.setText(model.getSnelheidTekst() + " m/s");
        if (model.getSpelers().get(0).getWorpen().size() == 1) {
        s1f1w1.setText(model.getSpelers().get(0).getWorpen().get(0).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 2) {
        s1f1w2.setText(model.getSpelers().get(0).getWorpen().get(1).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 3) {
        s1f1w3.setText(model.getSpelers().get(0).getWorpen().get(2).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 4) {
        s1f1.setText(model.getSpelers().get(0).getWorpen().get(3).toString());
        }
        eindScore1.setText(Integer.toString(model.getSpelers().get(0).getTotaalscore()));
        } else {
            snelheidLabel.setText("");
            s1f1w1.setText("");
            s1f1w2.setText("");
            s1f1w3.setText("");
            s1f1.setText("");
            eindScore1.setText("");
        }
    }
}
        