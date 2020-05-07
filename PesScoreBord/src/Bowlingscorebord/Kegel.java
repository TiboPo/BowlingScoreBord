/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bowlingscorebord;

/**
 *
 * @author dries
 */
public class Kegel {
    private int punten;
    private int kegelnummer;

    public Kegel(int punten, int kegelnummer) {
        this.punten = punten;
        this.kegelnummer = kegelnummer;
    }

    public int getPunten() {
        return punten;
    }

    public int getKegelnummer() {
        return kegelnummer;
    }
}
