/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bowlingscorebord;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author dries
 */
public class Spel {
    private ArrayList<Speler> spelers;
    private int kegel1;
    private int kegel2;
    private int kegel3;
    private int kegel4;
    private int kegel5;
    private int score;
    private double snelheid;
    private String snelheidTekst;
    private Input input;
    private static DecimalFormat df = new DecimalFormat("#.##");
    private int teller;
    private boolean kom1,kom2,kom3,kom4,kom5;

    public Spel() {
        snelheid = 0.0;
        input = new Input();
        spelers = new ArrayList();
        int teller = 0;
    }

    public void addSpeler(String naam){
        Speler speler = new Speler(naam);
        spelers.add(speler);
    }
    public ArrayList<Speler> getSpelers() {
        return spelers;
    }

    public double getSnelheid() {
        return snelheid;
    }

    public void resetSpel() {
        spelers.clear();
        snelheid = 0.0;
        input.reset();
    }
    public void berekenSnelheid() {
        snelheid = (0.60/((input.getTijd()/1000)*200));
        snelheidTekst = df.format(snelheid);
    }
    public String getSnelheidTekst() {
        return snelheidTekst;
    }
    public void tick() {
        berekenSnelheid();
        scoreupdate();
        input.arduino();
    }
    public void scoreupdate() {
        if (input.isActief() == false && input.getTijd() > 0 && spelers.size() == 6) {
        if (input.getWorpen() == 0) {
            kom1 = false;
           kom2 = false;
           kom3 = false;
           kom4 = false;
           kom5 = false;
            
           kegel1 = 0;
           kegel2 = 0;
           kegel3 = 0;
           kegel4 = 0;
           kegel5 = 0;
       }
            if (kegel1 != 2) {
            if (input.getKegel1() == 1) {
            kegel1 = 2;
            kom1 = true;
            } else {
            kegel1 = 0;
            }
            }
            if (kegel2 != 3) {
        if (input.getKegel2() == 1) {
            kegel2 = 3;
            kom2 = true;
            } else {
            kegel2 = 0;
            }
            }
            if (kegel3 != 5) {
        if (input.getKegel3() == 1) {
            kegel3 = 5;
            kom3 = true;
            } else {
            kegel3 = 0;
            }
            }
            if (kegel4 != 3) {
        if (input.getKegel4() == 1) {
            kegel4 = 3;
            kom4 = true;
            } else {
            kegel4 = 0;
            }
            }
            if (kegel5 != 2) {
        if (input.getKegel5() == 1) {
            kegel5 = 2;
            kom5 = true;
            } else {
            kegel5 = 0;
        }
            }
        if (teller == 0) {
        if(kom1){
        score = kegel1 + score;
        kom1 =false;
        }
        if(kom2){
        score = kegel2 + score;
        kom2 =false;
        }
        if(kom3){
        score = kegel3 + score;
        kom3 =false;
        }
        if(kom4){
        score = kegel4 + score;
        kom4 =false;
        }
        if(kom5){
        score = kegel5 + score;
        kom5 =false;
        }
        spelers.get(input.getSpelerNummer()).getWorpen().add(score);
        spelers.get(input.getSpelerNummer()).setTotaalscore(score);
        if(spelers.get(input.getSpelerNummer()).getWorpen().size() == 3){
        
        
        if(spelers.get(input.getSpelerNummer()).getStrike()){
           
            spelers.get(input.getSpelerNummer()).getWorpen().add("X");
        }
         if(spelers.get(input.getSpelerNummer()).getSpare()){
             spelers.get(input.getSpelerNummer()).getWorpen().add("/");
        }
         if(spelers.get(input.getSpelerNummer()).getStrike() == spelers.get(input.getSpelerNummer()).getSpare()){
             spelers.get(input.getSpelerNummer()).getWorpen().add("");
         }
        } 
        score = 0;
        
        }
        teller++;
        } else {
            teller = 0;
            
            
        }
    }
    public Input getInput() {
        return input;
    }
}
