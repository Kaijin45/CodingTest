import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        int i = 1;
        
        while(num>i){
            num = num - i;
            i++;
        }
        
        if(i%2==1){
            i = i - num + 1;
            bw.write(i+"/"+num+"\n");
        }
        else{
            i = i - num + 1;
            bw.write(num+"/"+i+"\n");
        }
        
        
        bw.flush();
        bw.close();
    }    
}
