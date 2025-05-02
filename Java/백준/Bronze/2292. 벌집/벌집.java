import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        int pass = 1;
        int line = 1;
        
        if(num ==1){
            bw.write(1+"\n");
        }
        else{
            while(num>line){
                pass++;
                line = line + pass*6 - 6;
            }
            bw.write(pass+"\n");
        }
        
        bw.flush();
        bw.close();
    }    
}
