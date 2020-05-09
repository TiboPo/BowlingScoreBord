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
    private int totaalscore,vorigeScore,bonus = 0;
    private ArrayList worpen;
    private String naam;
    private boolean strike = false,spare = false;
      
    
    public Speler(String naam) {
        totaalscore = 0;
        worpen = new ArrayList<>();
        this.naam = naam;
    }

    public int getTotaalscore() {
        return totaalscore;
    }
    public void setTotaalscore(int score) {
      
        totaalscore = score+totaalscore;
        
        if(bonus > 0){
            totaalscore = score + totaalscore;
            bonus--;
            strike = false;
            spare = false;
        }
          if (score == 15){
            bonus = 2; // strike
            strike = true;
        }
        if(vorigeScore + score == 15){
            bonus = 1; //spare
            spare = true;
        }
        vorigeScore = score;
    }

    public ArrayList getWorpen() {
        return worpen;
    }

    public String getNaam() {
        return naam;
    }
    public boolean getStrike(){
        return strike;
    }
     public boolean getSpare(){
        return spare;
    }
}
