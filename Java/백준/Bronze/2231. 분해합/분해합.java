import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int num = Integer.parseInt(br.readLine());
        int count = 1;
        int check = 0;
        
        while(count<num){
            int sum = count;    
            int spare = count;
            
            while(spare>0){
                sum = sum + spare%10;
                spare /= 10;
            }
            if(sum == num){
                check = 1;
                break;
            }
            else{
                count++;
            }
        }
        
        if(check==1){
            bw.write(count+"\n");
        }
        else{
            bw.write(check+"\n");
        }
        bw.flush();
        bw.close();
    }
}