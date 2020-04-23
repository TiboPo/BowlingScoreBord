/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bowlingscorebord;

import java.util.TimerTask;
import javafx.application.Platform;

/**
 *
 * @author dries
 */
public class Timertask extends TimerTask{
    private Spel model;
    private Controller controller;

    public Timertask(Spel model, Controller controller) {
        this.model = model;
        this.controller = controller;
    }
    public void run() {
       model.tick();
       Platform.runLater(()->{controller.update();});
    }
}
