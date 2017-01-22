// Author Kumar Dhakal
// email dhakalkumar10@gmail.com

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
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        
        Map<String,String> data = new HashMap<String,String>();
        for (int i = 0; i < N; i++) {
            String EXT = in.next().toLowerCase(); // file extension
            String MT = in.next(); // MIME type.
            data.put(EXT, MT);
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            
            if(FNAME.contains(".")){
                String extension = FNAME.substring(FNAME.lastIndexOf(".")+1).toLowerCase();
                String type = data.get(extension);
                //String type=null;
                // if(tp!=null){
                //     type = tp.toLowerCase();
                // }
                System.out.println(type==null ? "UNKNOWN" : type);
            }
            else{
                System.out.println("UNKNOWN");
            }
            
        }
    }
}
