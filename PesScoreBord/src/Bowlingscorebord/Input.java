/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bowlingscorebord;
import java.util.Scanner;
/**
 *
 * @author tibop
 */
public class Input {
    String tkegel1,tkegel2,tkegel3,tkegel4,tkegel5;
    public void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("kegel 1 ? ");
    String tkegel1 = myScanner.nextLine();
    
    System.out.println(tkegel1);
    }
}
