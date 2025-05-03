import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<num; i++){
            String wonderVPS = br.readLine();
            int count = 0;
            boolean check = true;
            
            for(int j=0; j<wonderVPS.length(); j++){
                 if(wonderVPS.charAt(j) == '('){
                     count++;
                 }
                 else{
                     count--;
                     if(count<0){
                         check = false;
                         break;
                     }
                 }
            }
            
            if(count>0){
                check = false;
            }
            
            if(check){
                bw.write("YES\n");
            }
            else{
                bw.write("NO\n");
            }
        }
        
        bw.flush();
        bw.close();
    }    
}
