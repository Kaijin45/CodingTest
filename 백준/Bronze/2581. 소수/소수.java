import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());
        
        int sum = 0;
        int min_num = 0;
        
        for(int i = min; i<= max; i++){
            if(i == 1){
                continue;
            }
            
            int checker = 0;
            
            for(int j = 2; j <= (int)Math.sqrt(i); j++){
                if(i % j == 0){
                    checker = 1;
                    break;
                }
            }
            if(checker == 0){
                sum += i;
                if(min_num == 0){
                    min_num = i;
                }
            }
            
        }
        if(min_num != 0){
            bw.write(sum+"\n");
            bw.write(min_num+"\n");
        }
        else{
            bw.write("-1\n");
        }
        bw.flush();
        bw.close();
    }    
}