import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        char x = br.readLine().charAt(0);
        int num = x;
        bw.write(num+"\n");
        
        bw.flush();
        bw.close();
    }    
}
