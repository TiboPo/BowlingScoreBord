package Bowlingscorebord;

import java.util.Timer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

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
    private Label s4f10w2;

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

    @FXML
    private Label s1f103;
    
    
    @FXML
    private Label s2f103;
    
    
    @FXML
    private Label s3f103;
    
    
    @FXML
    private Label s4f103;
    
    
    @FXML
    private Label s6f103;
    
    
    @FXML
    private Label s5f103;
    
    
    @FXML
    private Label s3f9w3;
    
     
    @FXML
    private Label s3f9w2;
     
     
    @FXML
    private Label s4f7w3;
     
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
        if (model.getSpelers().get(0).getWorpen().size() == 4) {
        s1f1w3.setText(model.getSpelers().get(0).getWorpen().get(2).toString());
        s1f1.setText(model.getSpelers().get(0).getWorpen().get(3).toString());
        }
        
        if (model.getSpelers().get(0).getWorpen().size() == 5) {
        s1f2w1.setText(model.getSpelers().get(0).getWorpen().get(4).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 6) {
        s1f2w2.setText(model.getSpelers().get(0).getWorpen().get(5).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 8) {
        s1f2w3.setText(model.getSpelers().get(0).getWorpen().get(6).toString());
        s1f2.setText(model.getSpelers().get(0).getWorpen().get(7).toString());
        }
        
        if (model.getSpelers().get(0).getWorpen().size() == 9) {
        s1f3w1.setText(model.getSpelers().get(0).getWorpen().get(8).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 10) {
        s1f3w2.setText(model.getSpelers().get(0).getWorpen().get(9).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 12) {
        s1f3w3.setText(model.getSpelers().get(0).getWorpen().get(10).toString());
        s1f3.setText(model.getSpelers().get(0).getWorpen().get(11).toString());
        }
        
        if (model.getSpelers().get(0).getWorpen().size() == 13) {
        s1f4w1.setText(model.getSpelers().get(0).getWorpen().get(12).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 14) {
        s1f4w2.setText(model.getSpelers().get(0).getWorpen().get(13).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 16) {
        s1f4w3.setText(model.getSpelers().get(0).getWorpen().get(14).toString());
        s1f4.setText(model.getSpelers().get(0).getWorpen().get(15).toString());
        }
        
        if (model.getSpelers().get(0).getWorpen().size() == 17) {
        s1f5w1.setText(model.getSpelers().get(0).getWorpen().get(16).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 18) {
        s1f5w2.setText(model.getSpelers().get(0).getWorpen().get(17).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 20) {
        s1f5w3.setText(model.getSpelers().get(0).getWorpen().get(18).toString());
        s1f5.setText(model.getSpelers().get(0).getWorpen().get(19).toString());
        }
        
        
        if (model.getSpelers().get(0).getWorpen().size() == 21) {
        s1f6w1.setText(model.getSpelers().get(0).getWorpen().get(20).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 22) {
        s1f6w2.setText(model.getSpelers().get(0).getWorpen().get(21).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 24) {
        s1f6w3.setText(model.getSpelers().get(0).getWorpen().get(22).toString());
        s1f6.setText(model.getSpelers().get(0).getWorpen().get(23).toString());
        }
        
          if (model.getSpelers().get(0).getWorpen().size() == 25) {
        s1f7w1.setText(model.getSpelers().get(0).getWorpen().get(24).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 26) {
        s1f7w2.setText(model.getSpelers().get(0).getWorpen().get(25).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 28) {
        s1f7w3.setText(model.getSpelers().get(0).getWorpen().get(26).toString());
        s1f7.setText(model.getSpelers().get(0).getWorpen().get(27).toString());
        }
        
        if (model.getSpelers().get(0).getWorpen().size() == 29) {
        s1f8w1.setText(model.getSpelers().get(0).getWorpen().get(28).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 30) {
        s1f8w2.setText(model.getSpelers().get(0).getWorpen().get(29).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 32) {
        s1f8w3.setText(model.getSpelers().get(0).getWorpen().get(30).toString());
        s1f8.setText(model.getSpelers().get(0).getWorpen().get(31).toString());
        }
        
        if (model.getSpelers().get(0).getWorpen().size() == 33) {
        s1f9w1.setText(model.getSpelers().get(0).getWorpen().get(32).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 34) {
        s1f9w2.setText(model.getSpelers().get(0).getWorpen().get(33).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 36) {
        s1f9w3.setText(model.getSpelers().get(0).getWorpen().get(34).toString());
        s1f9.setText(model.getSpelers().get(0).getWorpen().get(35).toString());
        }
        
        if (model.getSpelers().get(0).getWorpen().size() == 37) {
        s1f10w1.setText(model.getSpelers().get(0).getWorpen().get(36).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 38) {
        s1f10w2.setText(model.getSpelers().get(0).getWorpen().get(37).toString());
        }
        if (model.getSpelers().get(0).getWorpen().size() == 40) {
        s1f10w3.setText(model.getSpelers().get(0).getWorpen().get(38).toString());
        s1f103.setText(model.getSpelers().get(0).getWorpen().get(39).toString());
        }
    
        
        if (model.getSpelers().get(1).getWorpen().size() == 1) {
        s2f1w1.setText(model.getSpelers().get(1).getWorpen().get(0).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 2) {
        s2f1w2.setText(model.getSpelers().get(1).getWorpen().get(1).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 4) {
        s2f1w3.setText(model.getSpelers().get(1).getWorpen().get(2).toString());
        s2f1.setText(model.getSpelers().get(1).getWorpen().get(3).toString());
        }
        
        if (model.getSpelers().get(1).getWorpen().size() == 5) {
        s2f2w1.setText(model.getSpelers().get(1).getWorpen().get(4).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 6) {
        s2f2w2.setText(model.getSpelers().get(1).getWorpen().get(5).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 8) {
        s2f2w3.setText(model.getSpelers().get(1).getWorpen().get(6).toString());
        s2f2.setText(model.getSpelers().get(1).getWorpen().get(7).toString());
        }
        
        if (model.getSpelers().get(1).getWorpen().size() == 9) {
        s2f3w1.setText(model.getSpelers().get(1).getWorpen().get(8).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 10) {
        s2f3w2.setText(model.getSpelers().get(1).getWorpen().get(9).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 12) {
        s2f3w3.setText(model.getSpelers().get(1).getWorpen().get(10).toString());
        s2f3.setText(model.getSpelers().get(1).getWorpen().get(11).toString());
        }
        
        if (model.getSpelers().get(1).getWorpen().size() == 13) {
        s2f4w1.setText(model.getSpelers().get(1).getWorpen().get(12).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 14) {
        s2f4w2.setText(model.getSpelers().get(1).getWorpen().get(13).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 16) {
        s2f4w3.setText(model.getSpelers().get(1).getWorpen().get(14).toString());
        s2f4.setText(model.getSpelers().get(1).getWorpen().get(15).toString());
        }
        
        if (model.getSpelers().get(1).getWorpen().size() == 17) {
        s2f5w1.setText(model.getSpelers().get(1).getWorpen().get(16).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 18) {
        s2f5w2.setText(model.getSpelers().get(1).getWorpen().get(17).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 20) {
        s2f5w3.setText(model.getSpelers().get(1).getWorpen().get(18).toString());
        s2f5.setText(model.getSpelers().get(1).getWorpen().get(19).toString());
        }
        
        
        if (model.getSpelers().get(1).getWorpen().size() == 21) {
        s2f6w1.setText(model.getSpelers().get(1).getWorpen().get(20).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 22) {
        s2f6w2.setText(model.getSpelers().get(1).getWorpen().get(21).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 24) {
        s2f6w3.setText(model.getSpelers().get(1).getWorpen().get(22).toString());
        s2f6.setText(model.getSpelers().get(1).getWorpen().get(23).toString());
        }
        
          if (model.getSpelers().get(1).getWorpen().size() == 25) {
        s2f7w1.setText(model.getSpelers().get(1).getWorpen().get(24).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 26) {
        s2f7w2.setText(model.getSpelers().get(1).getWorpen().get(25).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 28) {
        s2f7w3.setText(model.getSpelers().get(1).getWorpen().get(26).toString());
        s2f7.setText(model.getSpelers().get(1).getWorpen().get(27).toString());
        }
        
        if (model.getSpelers().get(1).getWorpen().size() == 29) {
        s2f8w1.setText(model.getSpelers().get(1).getWorpen().get(28).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 30) {
        s2f8w2.setText(model.getSpelers().get(1).getWorpen().get(29).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 32) {
        s2f8w3.setText(model.getSpelers().get(1).getWorpen().get(30).toString());
        s2f8.setText(model.getSpelers().get(1).getWorpen().get(31).toString());
        }
        
        if (model.getSpelers().get(1).getWorpen().size() == 33) {
        s2f9w1.setText(model.getSpelers().get(1).getWorpen().get(32).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 34) {
        s2f9w2.setText(model.getSpelers().get(1).getWorpen().get(33).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 36) {
        s2f9w3.setText(model.getSpelers().get(1).getWorpen().get(34).toString());
        s2f9.setText(model.getSpelers().get(1).getWorpen().get(35).toString());
        }
        
        if (model.getSpelers().get(1).getWorpen().size() == 37) {
        s2f10w1.setText(model.getSpelers().get(1).getWorpen().get(36).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 38) {
        s2f10w2.setText(model.getSpelers().get(1).getWorpen().get(37).toString());
        }
        if (model.getSpelers().get(1).getWorpen().size() == 40) {
        s2f10w3.setText(model.getSpelers().get(1).getWorpen().get(38).toString());
        s2f103.setText(model.getSpelers().get(1).getWorpen().get(39).toString());
        }
        
        
        
                if (model.getSpelers().get(2).getWorpen().size() == 1) {
        s3f1w1.setText(model.getSpelers().get(2).getWorpen().get(0).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 2) {
        s3f1w2.setText(model.getSpelers().get(2).getWorpen().get(1).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 4) {
        s3f1w3.setText(model.getSpelers().get(2).getWorpen().get(2).toString());
        s3f1.setText(model.getSpelers().get(2).getWorpen().get(3).toString());
        }
        
        if (model.getSpelers().get(2).getWorpen().size() == 5) {
        s3f2w1.setText(model.getSpelers().get(2).getWorpen().get(4).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 6) {
        s3f2w2.setText(model.getSpelers().get(2).getWorpen().get(5).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 8) {
        s3f2w3.setText(model.getSpelers().get(2).getWorpen().get(6).toString());
        s3f2.setText(model.getSpelers().get(2).getWorpen().get(7).toString());
        }
        
        if (model.getSpelers().get(2).getWorpen().size() == 9) {
        s3f3w1.setText(model.getSpelers().get(2).getWorpen().get(8).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 10) {
        s3f3w2.setText(model.getSpelers().get(2).getWorpen().get(9).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 12) {
        s3f3w3.setText(model.getSpelers().get(2).getWorpen().get(10).toString());
        s3f3.setText(model.getSpelers().get(2).getWorpen().get(11).toString());
        }
        
        if (model.getSpelers().get(2).getWorpen().size() == 13) {
        s3f4w1.setText(model.getSpelers().get(2).getWorpen().get(12).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 14) {
        s3f4w2.setText(model.getSpelers().get(2).getWorpen().get(13).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 16) {
        s3f4w3.setText(model.getSpelers().get(2).getWorpen().get(14).toString());
        s3f4.setText(model.getSpelers().get(2).getWorpen().get(15).toString());
        }
        
        if (model.getSpelers().get(2).getWorpen().size() == 17) {
        s3f5w1.setText(model.getSpelers().get(2).getWorpen().get(16).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 18) {
        s3f5w2.setText(model.getSpelers().get(2).getWorpen().get(17).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 20) {
        s3f5w3.setText(model.getSpelers().get(2).getWorpen().get(18).toString());
        s3f5.setText(model.getSpelers().get(2).getWorpen().get(19).toString());
        }
        
        
        if (model.getSpelers().get(2).getWorpen().size() == 21) {
        s3f6w1.setText(model.getSpelers().get(2).getWorpen().get(20).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 22) {
        s3f6w2.setText(model.getSpelers().get(2).getWorpen().get(21).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 24) {
        s3f6w3.setText(model.getSpelers().get(2).getWorpen().get(22).toString());
        s3f6.setText(model.getSpelers().get(2).getWorpen().get(23).toString());
        }
        
          if (model.getSpelers().get(2).getWorpen().size() == 25) {
        s3f7w1.setText(model.getSpelers().get(2).getWorpen().get(24).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 26) {
        s3f7w2.setText(model.getSpelers().get(2).getWorpen().get(25).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 28) {
        s3f7w3.setText(model.getSpelers().get(2).getWorpen().get(26).toString());
        s3f7.setText(model.getSpelers().get(2).getWorpen().get(27).toString());
        }
        
        if (model.getSpelers().get(2).getWorpen().size() == 29) {
        s3f8w1.setText(model.getSpelers().get(2).getWorpen().get(28).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 30) {
        s3f8w2.setText(model.getSpelers().get(2).getWorpen().get(29).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 32) {
        s3f8w3.setText(model.getSpelers().get(2).getWorpen().get(30).toString());
        s3f8.setText(model.getSpelers().get(2).getWorpen().get(31).toString());
        }
        
        if (model.getSpelers().get(2).getWorpen().size() == 33) {
        s3f9w1.setText(model.getSpelers().get(2).getWorpen().get(32).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 34) {
        s3f9w2.setText(model.getSpelers().get(2).getWorpen().get(33).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 36) {
        s3f9w3.setText(model.getSpelers().get(2).getWorpen().get(34).toString());
        s3f9.setText(model.getSpelers().get(2).getWorpen().get(35).toString());
        }
        
        if (model.getSpelers().get(2).getWorpen().size() == 37) {
        s3f10w1.setText(model.getSpelers().get(2).getWorpen().get(36).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 38) {
        s3f10w2.setText(model.getSpelers().get(2).getWorpen().get(37).toString());
        }
        if (model.getSpelers().get(2).getWorpen().size() == 40) {
        s3f10w3.setText(model.getSpelers().get(2).getWorpen().get(38).toString());
        s3f103.setText(model.getSpelers().get(2).getWorpen().get(39).toString());
        }
        
        
                if (model.getSpelers().get(3).getWorpen().size() == 1) {
        s4f1w1.setText(model.getSpelers().get(3).getWorpen().get(0).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 2) {
        s4f1w2.setText(model.getSpelers().get(3).getWorpen().get(1).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 4) {
        s4f1w3.setText(model.getSpelers().get(3).getWorpen().get(2).toString());
        s4f1.setText(model.getSpelers().get(3).getWorpen().get(3).toString());
        }
        
        if (model.getSpelers().get(3).getWorpen().size() == 5) {
        s4f2w1.setText(model.getSpelers().get(3).getWorpen().get(4).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 6) {
        s4f2w2.setText(model.getSpelers().get(3).getWorpen().get(5).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 8) {
        s4f2w3.setText(model.getSpelers().get(3).getWorpen().get(6).toString());
        s4f2.setText(model.getSpelers().get(3).getWorpen().get(7).toString());
        }
        
        if (model.getSpelers().get(3).getWorpen().size() == 9) {
        s4f3w1.setText(model.getSpelers().get(3).getWorpen().get(8).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 10) {
        s4f3w2.setText(model.getSpelers().get(3).getWorpen().get(9).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 12) {
        s4f3w3.setText(model.getSpelers().get(3).getWorpen().get(10).toString());
        s4f3.setText(model.getSpelers().get(3).getWorpen().get(11).toString());
        }
        
        if (model.getSpelers().get(3).getWorpen().size() == 13) {
        s4f4w1.setText(model.getSpelers().get(3).getWorpen().get(12).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 14) {
        s4f4w2.setText(model.getSpelers().get(3).getWorpen().get(13).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 16) {
        s4f4w3.setText(model.getSpelers().get(3).getWorpen().get(14).toString());
        s4f4.setText(model.getSpelers().get(3).getWorpen().get(15).toString());
        }
        
        if (model.getSpelers().get(3).getWorpen().size() == 17) {
        s4f5w1.setText(model.getSpelers().get(3).getWorpen().get(16).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 18) {
        s4f5w2.setText(model.getSpelers().get(3).getWorpen().get(17).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 20) {
        s4f5w3.setText(model.getSpelers().get(3).getWorpen().get(18).toString());
        s4f5.setText(model.getSpelers().get(3).getWorpen().get(19).toString());
        }
        
        
        if (model.getSpelers().get(3).getWorpen().size() == 21) {
        s4f6w1.setText(model.getSpelers().get(3).getWorpen().get(20).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 22) {
        s4f6w2.setText(model.getSpelers().get(3).getWorpen().get(21).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 24) {
        s4f6w3.setText(model.getSpelers().get(3).getWorpen().get(22).toString());
        s4f6.setText(model.getSpelers().get(3).getWorpen().get(23).toString());
        }
        
          if (model.getSpelers().get(3).getWorpen().size() == 25) {
        s4f7w1.setText(model.getSpelers().get(3).getWorpen().get(24).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 26) {
        s4f7w2.setText(model.getSpelers().get(3).getWorpen().get(25).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 28) {
        s4f7w3.setText(model.getSpelers().get(3).getWorpen().get(26).toString());
        s4f7.setText(model.getSpelers().get(3).getWorpen().get(27).toString());
        }
        
        if (model.getSpelers().get(3).getWorpen().size() == 29) {
        s4f8w1.setText(model.getSpelers().get(3).getWorpen().get(28).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 30) {
        s4f8w2.setText(model.getSpelers().get(3).getWorpen().get(29).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 32) {
        s4f8w3.setText(model.getSpelers().get(3).getWorpen().get(30).toString());
        s4f8.setText(model.getSpelers().get(3).getWorpen().get(31).toString());
        }
        
        if (model.getSpelers().get(3).getWorpen().size() == 33) {
        s4f9w1.setText(model.getSpelers().get(3).getWorpen().get(32).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 34) {
        s4f9w2.setText(model.getSpelers().get(3).getWorpen().get(33).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 36) {
        s4f9w3.setText(model.getSpelers().get(3).getWorpen().get(34).toString());
        s4f9.setText(model.getSpelers().get(3).getWorpen().get(35).toString());
        }
        
        if (model.getSpelers().get(3).getWorpen().size() == 37) {
        s4f10w1.setText(model.getSpelers().get(3).getWorpen().get(36).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 38) {
        s4f10w2.setText(model.getSpelers().get(3).getWorpen().get(37).toString());
        }
        if (model.getSpelers().get(3).getWorpen().size() == 40) {
        s4f10w3.setText(model.getSpelers().get(3).getWorpen().get(38).toString());
        s4f103.setText(model.getSpelers().get(3).getWorpen().get(39).toString());
        }
        
        
            if (model.getSpelers().get(4).getWorpen().size() == 1) {
        s5f1w1.setText(model.getSpelers().get(4).getWorpen().get(0).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 2) {
        s5f1w2.setText(model.getSpelers().get(4).getWorpen().get(1).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 4) {
        s5f1w3.setText(model.getSpelers().get(4).getWorpen().get(2).toString());
        s5f1.setText(model.getSpelers().get(4).getWorpen().get(3).toString());
        }
        
        if (model.getSpelers().get(4).getWorpen().size() == 5) {
        s5f2w1.setText(model.getSpelers().get(4).getWorpen().get(4).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 6) {
        s5f2w2.setText(model.getSpelers().get(4).getWorpen().get(5).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 8) {
        s5f2w3.setText(model.getSpelers().get(4).getWorpen().get(6).toString());
        s5f2.setText(model.getSpelers().get(4).getWorpen().get(7).toString());
        }
        
        if (model.getSpelers().get(4).getWorpen().size() == 9) {
        s5f3w1.setText(model.getSpelers().get(4).getWorpen().get(8).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 10) {
        s5f3w2.setText(model.getSpelers().get(4).getWorpen().get(9).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 12) {
        s5f3w3.setText(model.getSpelers().get(4).getWorpen().get(10).toString());
        s5f3.setText(model.getSpelers().get(4).getWorpen().get(11).toString());
        }
        
        if (model.getSpelers().get(4).getWorpen().size() == 13) {
        s5f4w1.setText(model.getSpelers().get(4).getWorpen().get(12).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 14) {
        s5f4w2.setText(model.getSpelers().get(4).getWorpen().get(13).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 16) {
        s5f4w3.setText(model.getSpelers().get(4).getWorpen().get(14).toString());
        s5f4.setText(model.getSpelers().get(4).getWorpen().get(15).toString());
        }
        
        if (model.getSpelers().get(4).getWorpen().size() == 17) {
        s5f5w1.setText(model.getSpelers().get(4).getWorpen().get(16).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 18) {
        s5f5w2.setText(model.getSpelers().get(4).getWorpen().get(17).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 20) {
        s5f5w3.setText(model.getSpelers().get(4).getWorpen().get(18).toString());
        s5f5.setText(model.getSpelers().get(4).getWorpen().get(19).toString());
        }
        
        
        if (model.getSpelers().get(4).getWorpen().size() == 21) {
        s5f6w1.setText(model.getSpelers().get(4).getWorpen().get(20).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 22) {
        s5f6w2.setText(model.getSpelers().get(4).getWorpen().get(21).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 24) {
        s5f6w3.setText(model.getSpelers().get(4).getWorpen().get(22).toString());
        s5f6.setText(model.getSpelers().get(4).getWorpen().get(23).toString());
        }
        
          if (model.getSpelers().get(4).getWorpen().size() == 25) {
        s5f7w1.setText(model.getSpelers().get(4).getWorpen().get(24).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 26) {
        s5f7w2.setText(model.getSpelers().get(4).getWorpen().get(25).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 28) {
        s5f7w3.setText(model.getSpelers().get(4).getWorpen().get(26).toString());
        s5f7.setText(model.getSpelers().get(4).getWorpen().get(27).toString());
        }
        
        if (model.getSpelers().get(4).getWorpen().size() == 29) {
        s5f8w1.setText(model.getSpelers().get(4).getWorpen().get(28).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 30) {
        s5f8w2.setText(model.getSpelers().get(4).getWorpen().get(29).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 32) {
        s5f8w3.setText(model.getSpelers().get(4).getWorpen().get(30).toString());
        s5f8.setText(model.getSpelers().get(4).getWorpen().get(31).toString());
        }
        
        if (model.getSpelers().get(4).getWorpen().size() == 33) {
        s5f9w1.setText(model.getSpelers().get(4).getWorpen().get(32).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 34) {
        s5f9w2.setText(model.getSpelers().get(4).getWorpen().get(33).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 36) {
        s5f9w3.setText(model.getSpelers().get(4).getWorpen().get(34).toString());
        s5f9.setText(model.getSpelers().get(4).getWorpen().get(35).toString());
        }
        
        if (model.getSpelers().get(4).getWorpen().size() == 37) {
        s5f10w1.setText(model.getSpelers().get(4).getWorpen().get(36).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 38) {
        s5f10w2.setText(model.getSpelers().get(4).getWorpen().get(37).toString());
        }
        if (model.getSpelers().get(4).getWorpen().size() == 40) {
        s5f10w3.setText(model.getSpelers().get(4).getWorpen().get(38).toString());
        s5f103.setText(model.getSpelers().get(4).getWorpen().get(39).toString());
        }
        
        
        if (model.getSpelers().get(5).getWorpen().size() == 1) {
        s6f1w1.setText(model.getSpelers().get(5).getWorpen().get(0).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 2) {
        s6f1w2.setText(model.getSpelers().get(5).getWorpen().get(1).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 4) {
        s6f1w3.setText(model.getSpelers().get(5).getWorpen().get(2).toString());
        s6f1.setText(model.getSpelers().get(5).getWorpen().get(3).toString());
        }
        
        if (model.getSpelers().get(5).getWorpen().size() == 5) {
        s6f2w1.setText(model.getSpelers().get(5).getWorpen().get(4).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 6) {
        s6f2w2.setText(model.getSpelers().get(5).getWorpen().get(5).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 8) {
        s6f2w3.setText(model.getSpelers().get(5).getWorpen().get(6).toString());
        s6f2.setText(model.getSpelers().get(5).getWorpen().get(7).toString());
        }
        
        if (model.getSpelers().get(5).getWorpen().size() == 9) {
        s6f3w1.setText(model.getSpelers().get(5).getWorpen().get(8).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 10) {
        s6f3w2.setText(model.getSpelers().get(5).getWorpen().get(9).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 12) {
        s6f3w3.setText(model.getSpelers().get(5).getWorpen().get(10).toString());
        s6f3.setText(model.getSpelers().get(5).getWorpen().get(11).toString());
        }
        
        if (model.getSpelers().get(5).getWorpen().size() == 13) {
        s6f4w1.setText(model.getSpelers().get(5).getWorpen().get(12).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 14) {
        s6f4w2.setText(model.getSpelers().get(5).getWorpen().get(13).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 16) {
        s6f4w3.setText(model.getSpelers().get(5).getWorpen().get(14).toString());
        s6f4.setText(model.getSpelers().get(5).getWorpen().get(15).toString());
        }
        
        if (model.getSpelers().get(5).getWorpen().size() == 17) {
        s6f5w1.setText(model.getSpelers().get(5).getWorpen().get(16).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 18) {
        s6f5w2.setText(model.getSpelers().get(5).getWorpen().get(17).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 20) {
        s6f5w3.setText(model.getSpelers().get(5).getWorpen().get(18).toString());
        s6f5.setText(model.getSpelers().get(5).getWorpen().get(19).toString());
        }
        
        
        if (model.getSpelers().get(5).getWorpen().size() == 21) {
        s6f6w1.setText(model.getSpelers().get(5).getWorpen().get(20).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 22) {
        s6f6w2.setText(model.getSpelers().get(5).getWorpen().get(21).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 24) {
        s6f6w3.setText(model.getSpelers().get(5).getWorpen().get(22).toString());
        s6f6.setText(model.getSpelers().get(5).getWorpen().get(23).toString());
        }
        
          if (model.getSpelers().get(5).getWorpen().size() == 25) {
        s6f7w1.setText(model.getSpelers().get(5).getWorpen().get(24).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 26) {
        s6f7w2.setText(model.getSpelers().get(5).getWorpen().get(25).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 28) {
        s6f7w3.setText(model.getSpelers().get(5).getWorpen().get(26).toString());
        s6f7.setText(model.getSpelers().get(5).getWorpen().get(27).toString());
        }
        
        if (model.getSpelers().get(5).getWorpen().size() == 29) {
        s6f8w1.setText(model.getSpelers().get(5).getWorpen().get(28).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 30) {
        s6f8w2.setText(model.getSpelers().get(5).getWorpen().get(29).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 32) {
        s6f8w3.setText(model.getSpelers().get(5).getWorpen().get(30).toString());
        s6f8.setText(model.getSpelers().get(5).getWorpen().get(31).toString());
        }
        
        if (model.getSpelers().get(5).getWorpen().size() == 33) {
        s6f9w1.setText(model.getSpelers().get(5).getWorpen().get(32).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 34) {
        s6f9w2.setText(model.getSpelers().get(5).getWorpen().get(33).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 36) {
        s6f9w3.setText(model.getSpelers().get(5).getWorpen().get(34).toString());
        s6f9.setText(model.getSpelers().get(5).getWorpen().get(35).toString());
        }
        
        if (model.getSpelers().get(5).getWorpen().size() == 37) {
        s6f10w1.setText(model.getSpelers().get(5).getWorpen().get(36).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 38) {
        s6f10w2.setText(model.getSpelers().get(5).getWorpen().get(37).toString());
        }
        if (model.getSpelers().get(5).getWorpen().size() == 40) {
        s6f10w3.setText(model.getSpelers().get(5).getWorpen().get(38).toString());
        s6f103.setText(model.getSpelers().get(5).getWorpen().get(39).toString());
        }
        
        eindScore1.setText(Integer.toString(model.getSpelers().get(0).getTotaalscore()));
        eindScore2.setText(Integer.toString(model.getSpelers().get(1).getTotaalscore()));
        eindScore3.setText(Integer.toString(model.getSpelers().get(2).getTotaalscore()));
        eindScore4.setText(Integer.toString(model.getSpelers().get(3).getTotaalscore()));
        eindScore5.setText(Integer.toString(model.getSpelers().get(4).getTotaalscore()));
        eindScore6.setText(Integer.toString(model.getSpelers().get(5).getTotaalscore()));
        } else if (model.getSpelers().isEmpty()) {
            s1f1w1.setText("");
            s1f1w2.setText("");
            s1f1w3.setText("");
            s1f1.setText("");
            s1f2w1.setText("");
            s1f2w2.setText("");
            s1f2w3.setText("");
            s1f2.setText("");
            s1f3w1.setText("");
            s1f3w2.setText("");
            s1f3w3.setText("");
            s1f3.setText("");
            s1f4w1.setText("");
            s1f4w2.setText("");
            s1f4w3.setText("");
            s1f4.setText("");
            s1f5w1.setText("");
            s1f5w2.setText("");
            s1f5w3.setText("");
            s1f5.setText("");
            s1f6w1.setText("");
            s1f6w2.setText("");
            s1f6w3.setText("");
            s1f6.setText("");
            s1f7w1.setText("");
            s1f7w2.setText("");
            s1f7w3.setText("");
            s1f7.setText("");
            s1f8w1.setText("");
            s1f8w2.setText("");
            s1f8w3.setText("");
            s1f8.setText("");
            s1f9w1.setText("");
            s1f9w2.setText("");
            s1f9w3.setText("");
            s1f9.setText("");
            s1f10w1.setText("");
            s1f10w2.setText("");
            s1f10w3.setText("");
            s1f103.setText("");
            
            s2f1w1.setText("");
            s2f1w2.setText("");
            s2f1w3.setText("");
            s2f1.setText("");
            s2f2w1.setText("");
            s2f2w2.setText("");
            s2f2w3.setText("");
            s2f2.setText("");
            s2f3w1.setText("");
            s2f3w2.setText("");
            s2f3w3.setText("");
            s2f3.setText("");
            s2f4w1.setText("");
            s2f4w2.setText("");
            s2f4w3.setText("");
            s2f4.setText("");
            s2f5w1.setText("");
            s2f5w2.setText("");
            s2f5w3.setText("");
            s2f5.setText("");
            s2f6w1.setText("");
            s2f6w2.setText("");
            s2f6w3.setText("");
            s2f6.setText("");
            s2f7w1.setText("");
            s2f7w2.setText("");
            s2f7w3.setText("");
            s2f7.setText("");
            s2f8w1.setText("");
            s2f8w2.setText("");
            s2f8w3.setText("");
            s2f8.setText("");
            s2f9w1.setText("");
            s2f9w2.setText("");
            s2f9w3.setText("");
            s2f9.setText("");
            s2f10w1.setText("");
            s2f10w2.setText("");
            s2f10w3.setText("");
            s2f103.setText("");
            
            s3f1w1.setText("");
            s3f1w2.setText("");
            s3f1w3.setText("");
            s3f1.setText("");
            s3f2w1.setText("");
            s3f2w2.setText("");
            s3f2w3.setText("");
            s3f2.setText("");
            s3f3w1.setText("");
            s3f3w2.setText("");
            s3f3w3.setText("");
            s3f3.setText("");
            s3f4w1.setText("");
            s3f4w2.setText("");
            s3f4w3.setText("");
            s3f4.setText("");
            s3f5w1.setText("");
            s3f5w2.setText("");
            s3f5w3.setText("");
            s3f5.setText("");
            s3f6w1.setText("");
            s3f6w2.setText("");
            s3f6w3.setText("");
            s3f6.setText("");
            s3f7w1.setText("");
            s3f7w2.setText("");
            s3f7w3.setText("");
            s3f7.setText("");
            s3f8w1.setText("");
            s3f8w2.setText("");
            s3f8w3.setText("");
            s3f8.setText("");
            s3f9w1.setText("");
            s3f9w2.setText("");
            s3f9w3.setText("");
            s3f9.setText("");
            s3f10w1.setText("");
            s3f10w2.setText("");
            s3f10w3.setText("");
            s3f103.setText("");
            
            s4f1w1.setText("");
            s4f1w2.setText("");
            s4f1w3.setText("");
            s4f1.setText("");
            s4f2w1.setText("");
            s4f2w2.setText("");
            s4f2w3.setText("");
            s4f2.setText("");
            s4f3w1.setText("");
            s4f3w2.setText("");
            s4f3w3.setText("");
            s4f3.setText("");
            s4f4w1.setText("");
            s4f4w2.setText("");
            s4f4w3.setText("");
            s4f4.setText("");
            s4f5w1.setText("");
            s4f5w2.setText("");
            s4f5w3.setText("");
            s4f5.setText("");
            s4f6w1.setText("");
            s4f6w2.setText("");
            s4f6w3.setText("");
            s4f6.setText("");
            s4f7w1.setText("");
            s4f7w2.setText("");
            s4f7w3.setText("");
            s4f7.setText("");
            s4f8w1.setText("");
            s4f8w2.setText("");
            s4f8w3.setText("");
            s4f8.setText("");
            s4f9w1.setText("");
            s4f9w2.setText("");
            s4f9w3.setText("");
            s4f9.setText("");
            s4f10w1.setText("");
            s4f10w2.setText("");
            s4f10w3.setText("");
            s4f103.setText("");
            
            s5f1w1.setText("");
            s5f1w2.setText("");
            s5f1w3.setText("");
            s5f1.setText("");
            s5f2w1.setText("");
            s5f2w2.setText("");
            s5f2w3.setText("");
            s5f2.setText("");
            s5f3w1.setText("");
            s5f3w2.setText("");
            s5f3w3.setText("");
            s5f3.setText("");
            s5f4w1.setText("");
            s5f4w2.setText("");
            s5f4w3.setText("");
            s5f4.setText("");
            s5f5w1.setText("");
            s5f5w2.setText("");
            s5f5w3.setText("");
            s5f5.setText("");
            s5f6w1.setText("");
            s5f6w2.setText("");
            s5f6w3.setText("");
            s5f6.setText("");
            s5f7w1.setText("");
            s5f7w2.setText("");
            s5f7w3.setText("");
            s5f7.setText("");
            s5f8w1.setText("");
            s5f8w2.setText("");
            s5f8w3.setText("");
            s5f8.setText("");
            s5f9w1.setText("");
            s5f9w2.setText("");
            s5f9w3.setText("");
            s5f9.setText("");
            s5f10w1.setText("");
            s5f10w2.setText("");
            s5f10w3.setText("");
            s5f103.setText("");
            
            s6f1w1.setText("");
            s6f1w2.setText("");
            s6f1w3.setText("");
            s6f1.setText("");
            s6f2w1.setText("");
            s6f2w2.setText("");
            s6f2w3.setText("");
            s6f2.setText("");
            s6f3w1.setText("");
            s6f3w2.setText("");
            s6f3w3.setText("");
            s6f3.setText("");
            s6f4w1.setText("");
            s6f4w2.setText("");
            s6f4w3.setText("");
            s6f4.setText("");
            s6f5w1.setText("");
            s6f5w2.setText("");
            s6f5w3.setText("");
            s6f5.setText("");
            s6f6w1.setText("");
            s6f6w2.setText("");
            s6f6w3.setText("");
            s6f6.setText("");
            s6f7w1.setText("");
            s6f7w2.setText("");
            s6f7w3.setText("");
            s6f7.setText("");
            s6f8w1.setText("");
            s6f8w2.setText("");
            s6f8w3.setText("");
            s6f8.setText("");
            s6f9w1.setText("");
            s6f9w2.setText("");
            s6f9w3.setText("");
            s6f9.setText("");
            s6f10w1.setText("");
            s6f10w2.setText("");
            s6f10w3.setText("");
            s6f103.setText("");
            snelheidLabel.setText("");
            
            eindScore1.setText("");
            eindScore2.setText("");
            eindScore3.setText("");
            eindScore4.setText("");
            eindScore5.setText("");
            eindScore6.setText("");
             
        } else {
            snelheidLabel.setText("");
        }
    }
}
        