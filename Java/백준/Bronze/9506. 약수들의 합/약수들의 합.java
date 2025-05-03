import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num == -1){
                break;
            }
            
            String answer = num + " = 1";
            int sum = 1;
            
            for(int i = 2; i < num; i++){
                if(num%i == 0){
                    sum += i;
                    answer = answer + " + " + i;
                }
            }
            
            if(sum == num){
                bw.write(answer+"\n");
            }
            else{
                bw.write(num+" is NOT perfect.\n");
            }
        }
        bw.flush();
        bw.close();
    }    
}