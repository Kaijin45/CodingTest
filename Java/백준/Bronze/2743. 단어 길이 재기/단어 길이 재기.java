import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        String X = br.readLine();
        int X_len = X.length();
        
        
        bw.write(X_len+"\n");
        
        bw.flush();
        bw.close();
    }    
}
