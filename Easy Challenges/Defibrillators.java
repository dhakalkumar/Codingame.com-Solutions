
// Author Kumar Dhakal
// email dhakalkumar10@gmail.com

import java.util.*;
import java.io.*;
import java.math.*;

class Defib{
    private int id;
    private String name;
    private String address;
    private String phone;
    private double longitude;
    private double latitude;
    Defib(int id,String name,String address,String phone,double longitude,double latitude){
        this.id=id;
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.longitude=longitude;
        this.latitude=latitude;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public double getLongitude(){
        return longitude;
    }
    public double getLatitude(){
        return latitude;
    }
}

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String LON = in.next(); 
        String longA = LON.replace(',','.'); // replace comma(,) in the longitude with a dot(.)
             
        String LAT = in.next();
        String latA = LAT.replace(',','.');  //  replace comma(,) in the latitude with a dot(.)
         
        double longitudeA =  (3.1416/180.0)*Double.parseDouble(longA); // convert string in longA into number(and into radian)
        
        double latitudeA =  (3.1416/180.0)*Double.parseDouble(latA);  // convert string in latA into number(and into radian)
      
        int N = in.nextInt();
        in.nextLine();
        String[] fields;
        int id;
        String name;
        String address;
        String phone;
        double longitudeB;
        double latitudeB;
        double x = 0.0;
        double y = 0.0;
        double[] dist = new double[N];
         ArrayList<Defib> fileData = new ArrayList<Defib>();
        
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            DEFIB = DEFIB.replace(',','.');
            fields = DEFIB.split(";");
            id = Integer.parseInt(fields[0]);
            name = fields[1];
            address = fields[2];
            phone = fields[3];
            longitudeB = (3.1416/180.0)* Double.parseDouble(fields[4]);
            latitudeB = (3.1416/180.0)*Double.parseDouble(fields[5]);
            
            Defib defibdata = new Defib(id,name,address,phone,longitudeB,latitudeB);
          
            fileData.add(defibdata);
            
            x = (longitudeB-longitudeA)*Math.cos( (latitudeA+latitudeB)/2 );
            y = (latitudeB - latitudeA);
            
            dist[i] = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
      
       }
        double min = dist[0];
        int minIndex = 0;
        for(int j = 0;j<N;j++){
            if(min>dist[j]){
            	min = dist[j];
                minIndex = j;
            }
        }
        String output = "";
        for(int k=0;k<N;k++){
            if(minIndex==k){
        	    output = fileData.get(k).getName();
            }
        }
        
        System.out.println(output);   
        
     }
}
