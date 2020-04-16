/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PesScoreBord;

/**
 *
 * @author tibop
 */
public class Kegel {
    private int kegelnr;
    private boolean lig;

    public Kegel(int kegelnr) {
        this.kegelnr = kegelnr;
        this.lig = false;
    }
    
    public int getKegelnr() {
        return kegelnr;
    }

    public boolean isLig() {
        return lig;
    }
    
    public void gooiOm(){
        lig = true;
    }
    
}
