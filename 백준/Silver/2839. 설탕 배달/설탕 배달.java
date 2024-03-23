import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        
        while(num>0){
            if(num == 3){
                count += 1;
                num = 0;
                break;
            }
            else if(num == 6){
                count += 2;
                num = 0;
                break;
            }
            else if(num == 9){
                count += 3;
                num = 0;
                break;
            }
            else if(num == 12){
                count += 4;
                num = 0;
                break;
            }
            
            num -= 5;
            count++;
        }
        
        if(num==0){
            bw.write(count+"\n");
        }
        else{
            bw.write("-1\n");
        }
        
        bw.flush();
        bw.close();
    }    
}
