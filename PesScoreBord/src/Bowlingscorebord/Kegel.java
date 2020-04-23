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
    private boolean omver;
    private int kegelnummer;

    public Kegel(int punten, int kegelnummer) {
        this.punten = punten;
        omver = false;
        this.kegelnummer = kegelnummer;
    }

    public int getPunten() {
        return punten;
    }

    public boolean isOmver() {
        return omver;
    }

    public int getKegelnummer() {
        return kegelnummer;
    }

    public void setOmver(boolean omver) {
        this.omver = omver;
    }
    public void resetKegels() {
        omver = false;
    }
}
