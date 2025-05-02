import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        Long num = Long.parseLong(br.readLine());
        
        num = num*(num-1)/2;
        
        bw.write(num+"\n");
        bw.write("2\n");
        
        bw.flush();
        bw.close();
    }    
}
