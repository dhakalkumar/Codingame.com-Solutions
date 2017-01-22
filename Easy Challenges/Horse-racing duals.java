// Author Kumar Dhakal
// email: dhakalkumar

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
        int N = in.nextInt();
        List<Integer> Pi = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            Pi.add(pi);
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        Pi.sort(null);
        //int x = Pi.get(0);
        
        int diff =0; // assume a starting point for difference
        int minDiff=10000;
        for(int j=0;j<N-1;j++){
            diff = Math.abs(Pi.get(j)-Pi.get(j+1));  // calculate the difference between two consecutive horses
            if(minDiff>diff){ 
                minDiff=diff;
            }
        }
        System.out.println(minDiff);
    }
}
