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
    private int totaalscore,vorigeScore,bonus = 0,teller = 0;
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
      
        if(teller == 3){
          teller = 0;
      }
        teller++;

      
        totaalscore = score+totaalscore;
        if(score > 0 ){
        if(bonus > 0){
            totaalscore = score + totaalscore;
            if(strike && bonus == 1){
                strike = false;
            }
                spare = false;
            bonus--;
        }
      }
          if (score == 15 && teller == 1){
            bonus = 2; // strike
            System.out.println("strike");
            strike = true;
        }
        if(vorigeScore + score == 15 && strike == false && teller == 2){
            bonus = 1; //spare
            System.out.println("spare");
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
