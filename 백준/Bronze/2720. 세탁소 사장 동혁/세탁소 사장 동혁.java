import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        
        
        for(int i = 1; i<=num; i++){
            int refund = Integer.parseInt(br.readLine());
            int Quarter = 0;
            int Dime = 0;
            int Nickel = 0;
            int Penny = 0;
            
            while(refund>=25){
                refund -= 25;
                Quarter++;
            }
            while(refund>=10){
                refund -= 10;
                Dime++;
            }
            while(refund>=5){
                refund -= 5;
                Nickel++;
            }
            while(refund>=1){
                refund -= 1;
                Penny++;
            }
            
            bw.write(Quarter+" "+Dime+" "+Nickel+" "+Penny+"\n");
        }
        
        bw.flush();
        bw.close();
    }    
}
