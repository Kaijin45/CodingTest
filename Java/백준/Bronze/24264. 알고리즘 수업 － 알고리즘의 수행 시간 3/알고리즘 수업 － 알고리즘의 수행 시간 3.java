import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));

        
        long num = Long.parseLong(br.readLine());
        num *= num;
        
        bw.write(num+"\n");
        bw.write(2+"\n");
        
        bw.flush();
        bw.close();
    }    
}
