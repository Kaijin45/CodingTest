import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        if(a+b+c != 180){
            bw.write("Error");
        }
        else if(a==b && a ==c){
            bw.write("Equilateral");
        }
        else if(a!=b && a!=c && b!=c){
            bw.write("Scalene");
        }
        else{
            bw.write("Isosceles");
        }
        
        bw.flush();
        bw.close();
    }    
}
