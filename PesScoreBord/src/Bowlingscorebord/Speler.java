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
public class Speler {
    private int totaalscore;
    private ArrayList worpen;
    private String naam;

    public Speler(String naam) {
        totaalscore = 0;
        worpen = new ArrayList<>();
        this.naam = naam;
    }

    public int getTotaalscore() {
        return totaalscore;
    }

    public ArrayList getWorpen() {
        return worpen;
    }

    public String getNaam() {
        return naam;
    }
    
    public void resetspeler() {
        totaalscore = 0;
        naam = null;
        worpen = null;
    }
}
