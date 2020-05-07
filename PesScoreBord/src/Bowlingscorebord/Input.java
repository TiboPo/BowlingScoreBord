//dit bestand vervangen door Jarduino.
package Bowlingscorebord;
/**
 *
 * @author tibop
 */
import java.util.Random;
import org.sintef.jarduino.DigitalPin;
import org.sintef.jarduino.DigitalState;
import org.sintef.jarduino.JArduino;
import org.sintef.jarduino.PinMode;
public class Input extends JArduino {
    double tijd;
    int kegel1;
    int kegel2;
    int kegel3;
    int kegel4;
    int kegel5;
    int kegel6;
    boolean actief;
    int spelerNummer;
    int worpen;

    public Input(String port) {
        super(port);
        tijd = 0;
        kegel1 = 0;
        kegel2 = 0;
        kegel3 = 0;
        kegel4 = 0;
        kegel5 = 0;
        kegel6 = 0;
        spelerNummer = -1;
        worpen = 0;
    }
    @Override
    protected void setup() {
        pinMode(DigitalPin.PIN_11, PinMode.INPUT);
        pinMode(DigitalPin.PIN_12, PinMode.INPUT);
        pinMode(DigitalPin.PIN_13, PinMode.INPUT);
    }
    @Override
    protected void loop() {
        DigitalState knop1 = digitalRead(DigitalPin.PIN_11);
        DigitalState knop2 = digitalRead(DigitalPin.PIN_12); 
        DigitalState sensor = digitalRead(DigitalPin.PIN_13);
        if (knop1 == HIGH) {
            actief = true;
            tijd = 0;
            worpen++;
            if (worpen == 4) {
                spelerNummer++;
                worpen = 1;
            }
        }
        if (knop2 == HIGH) {
            actief = false;
            if (sensor == HIGH) {
                kegel3 = 1;
            } else {
                kegel3 = 0;
            }
        }
        if (actief = true) {
            tijd++;
        }
        if (spelerNummer == 6) {
            spelerNummer = 0;
        }
        delay(1);
    }
    public double getTijd() {
        return tijd;
    }

    public int getKegel1() {
        Random r = new Random();
        kegel1 = r.nextInt(2);
        return kegel1;
    }

    public boolean isActief() {
        return actief;
    }
    public void reset() {
        actief = false;
    }
    public int getKegel2() {
        Random r = new Random();
        kegel2 = r.nextInt(2);
        return kegel2;
    }

    public int getKegel3() {
        return kegel3;
    }

    public int getKegel4() {
        Random r = new Random();
        kegel4 = r.nextInt(2);
        return kegel4;
    }

    public int getKegel5() {
        Random r = new Random();
        kegel5 = r.nextInt(2);
        return kegel5;
    }

    public int getSpelerNummer() {
        return spelerNummer;
    }

}
