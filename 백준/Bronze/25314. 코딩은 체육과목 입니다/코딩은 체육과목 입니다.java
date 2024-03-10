import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int k = Integer.parseInt(br.readLine());
        int num = k / 4;
        
        for(int i = 1; i<=num; i++){
            bw.write("long ");
        }
        bw.write("int");
        bw.flush();
        bw.close();
    }    
}
