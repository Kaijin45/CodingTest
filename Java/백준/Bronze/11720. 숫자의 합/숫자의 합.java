import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        
        String x = br.readLine();
        char[] arr = x.toCharArray();
        int sum = 0;
        
        for(int i = 0; i<num; i++){
            sum = sum + arr[i] - '0';
                
        }
        bw.write(sum+"\n");
        bw.flush();
        bw.close();
    }    
}
