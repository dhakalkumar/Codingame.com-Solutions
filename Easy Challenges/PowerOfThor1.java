//  Author: Kumar Dhakal
//  email: dhakalkumar10@gmail.com

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        String dirX="", dirY="";
        int TX=initialTX;
        int TY=initialTY;
        int LX=lightX;
        int LY=lightY;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
           
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            
              if (TY == LY) {
        if (TX < LX) {
            System.out.println("E");
            TX++; 
        } else { 
            System.out.println("W");
            TX--;
        }
    } else if (TY > LY) {
        if (TX == LX) {
            System.out.println("N");
            System.err.println(TY);
            TY--;
        } else if (TX > LX) {
            System.out.println("NW");
            TX--;
            TY--;
        } else {
            System.out.println("NE");
            TX++;
            TY--;
        }
    } else if (TY < LY) {
        if (TX == LX) {
            System.out.println("S");
            TY++;
        } else if (TX > LX) {
            System.out.println("SW");
            TX--;
            TY++;
        } else {
            System.out.println("SE");
            TX++;
            TY++;
        }
     }
   }
 }
}
