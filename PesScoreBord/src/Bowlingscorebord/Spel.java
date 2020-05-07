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

    public Spel() {
        snelheid = 0.0;
        input = new Input();
        spelers = new ArrayList();
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
        if (input.getKegel1() == 1) {
            kegel1 = 2;
            } else {
            kegel1 = 0;
            }
        if (input.getKegel2() == 1) {
            kegel2 = 3;
            } else {
            kegel2 = 0;
            }
        if (input.getKegel3() == 1) {
            kegel3 = 5;
            } else {
            kegel3 = 0;
            }
        if (input.getKegel4() == 1) {
            kegel4 = 3;
            } else {
            kegel4 = 0;
            }
        if (input.getKegel5() == 1) {
            kegel5 = 2;
            } else {
            kegel5 = 0;
        }
        //if (input.getTkegel1() == 1 && input.getTkegel2() == 1 && input.getTkegel3() == 1 && input.getTkegel4() == 1 && input.getTkegel5() == 1) {
            //score = 15 +;
            //} else if ({
            //kegel5 = 0;
        //} else {
        score = kegel1 + kegel2+ kegel3 + kegel4 + kegel5;
        spelers.get(input.getSpelerNummer()).getWorpen().add(score);
        spelers.get(input.getSpelerNummer()).setTotaalscore(score);
        }
    }
    public Input getInput() {
        return input;
    }
}
