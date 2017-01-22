//  Author Kumar Dhakal
//  email dhakalkumar10@gmail.com

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String TEMPS = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
        if(N==0){
            System.out.println("0");
            return;
        }
      
       // in.nextLine();
       // String TEMPS = in.nextLine(); // the N temperatures expressed as integers ranging from -273 to 5526
       
        String[] tempsArray = TEMPS.split(" ");
        int min = Integer.MAX_VALUE;
        int absmin = min;
        for(int i = 0; i < tempsArray.length; i++){
            int value = Integer.valueOf(tempsArray[i]);
            int absValue = Math.abs(value);
            if( absValue < absmin || (absValue == absmin && value > min )){
                min = value;
                absmin = absValue;
            }
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(min);
    }
}
