package Bowlingscorebord;
/**
 *
 * @author tibop
 */
import java.util.Random;
import com.fazecast.jSerialComm.*;
import java.util.Scanner;

public class Input {
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
    Scanner data;

    public Input() {
        tijd = 0;
        kegel1 = 0;
        kegel2 = 0;
        kegel3 = 0;
        kegel4 = 0;
        kegel5 = 0;
        kegel6 = 0;
        spelerNummer = 0;
        worpen = 0;
        actief = false;
        // Arduino poortconfiguratie
        SerialPort ports[] = SerialPort.getCommPorts();
        SerialPort port = ports[0]; //indien geen data hier nummer veranderen
        port.openPort();
        port.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);
        data = new Scanner(port.getInputStream());
}

    public void arduino() {
        // Seriële data Arduino omzetten in variabelen
        if (data.hasNextLine()) {
            String var = data.nextLine();
            String var1 = var.substring(var.indexOf("t") + 1, var.indexOf("s"));
            String var2 = var.substring(var.indexOf("s") + 1, var.indexOf("w"));
            String var3 = var.substring(var.indexOf("w") + 1, var.indexOf("n"));
            String var4 = var.substring(var.indexOf("n") + 1, var.indexOf("k"));
            String var5 = var.substring(var.indexOf("k") + 1, var.indexOf("/"));
            tijd = Double.valueOf(var1);
            kegel3 = Integer.parseInt(var5);
            worpen = Integer.parseInt(var3);
            spelerNummer = Integer.parseInt(var4);
            if (Integer.parseInt(var2) == 1) {
                actief = true;
            } else {
                actief = false;
            }
        }
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
