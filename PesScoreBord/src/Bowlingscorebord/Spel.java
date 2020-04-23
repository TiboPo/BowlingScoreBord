/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bowlingscorebord;

import java.util.ArrayList;

/**
 *
 * @author dries
 */
public class Spel {
    private boolean actief;
    private ArrayList<Speler> spelers;
    private ArrayList<Kegel> kegels;
    private double snelheid;

    public Spel() {
        actief = false;
        snelheid = 0.0;
        ArrayList<Speler> spelers = new ArrayList();
        ArrayList<Kegel> kegels = new ArrayList();
        Kegel kegel1 = new Kegel(5, 1);
        Kegel kegel2 = new Kegel(3, 2);
        Kegel kegel3 = new Kegel(3, 3);
        Kegel kegel4 = new Kegel(2, 4);
        Kegel kegel5 = new Kegel(2, 5);
        kegels.add(kegel1);
        kegels.add(kegel2);
        kegels.add(kegel3);
        kegels.add(kegel4);
        kegels.add(kegel5);
    }

    public boolean isActief() {
        return actief;
    }

    public ArrayList<Speler> getSpelers() {
        return spelers;
    }

    public double getSnelheid() {
        return snelheid;
    }

    public void startSpel() {
        actief = true;
    }
    
    public void resetSpel() {
        actief = false;
        for(Speler speler:spelers) {
            speler.resetspeler();
        } 
    }

    public void setSnelheid(double snelheid) {
        this.snelheid = snelheid;
    }  
    public void tick() {
        
    }  
}
