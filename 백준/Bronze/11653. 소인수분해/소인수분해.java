import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int i = 2;
        
        while(N>1){
           if(N%i == 0){
               bw.write(i+"\n");
               N /= i;
           }
            else{
                i++;
            }
        }
        
        bw.flush();
        bw.close();
    }    
}