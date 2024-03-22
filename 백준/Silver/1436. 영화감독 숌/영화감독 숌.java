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
        int i = 665;
        
        while(num>0){
            i++;
            String a = Integer.toString(i);
            if(a.contains("666")){
                num--;
            }
        }
        bw.write(i+"\n");
        
        bw.flush();
        bw.close();
    }    
}
