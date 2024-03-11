import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        String A;
        while((A = br.readLine())!= null){
            
            bw.write(A+"\n");
        }
        
        bw.flush();
        bw.close();
    }    
}
