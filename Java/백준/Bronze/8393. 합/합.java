import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int Hour = 0;
        
        for(int i = 1; i<=num; i++){
            
            Hour += i;
        }
        bw.write(Hour+"\n");
        bw.flush();
        bw.close();
    }    
}
