/*
 *@author D.Whelan
 *13/12/2014
 * Monty.java
 */

import javax.swing.JOptionPane;
import java.util.Random;
public class MontyApp {

    public static void main(String[] args){
          int user_door;
          int open_door;
          int prize_door;
          Random ran = new Random();
          double stay = 0.0;
          double swich = 0.0;
          int counter;

          Monty myMonty= new Monty ();
          myMonty.compute();

    }
}


