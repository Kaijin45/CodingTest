import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        br.close();
        
        if(num == 0 || num == 1){
            bw.write("0");
            bw.flush();
            bw.close();
            return;
        }
        
        int c2 = 0;
        int c5 = 0;
        
        for(int i = 2; i <= num; i++){
            int j = i;
            while(j>=2 && (j%2 == 0)){
                c2++;
                j = j/2;
            }
            while(j>=5 && (j%5 == 0)){
                c5++;
                j = j/5;
            }
        }
        
        if(c2>c5){
            bw.write(c5+"\n");
        }
        else{
            bw.write(c2+"\n");
        }
        bw.flush();
        bw.close();
    }
}