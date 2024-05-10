import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write(num*(num-1)+"\n");
        bw.flush();
        bw.close();
    }
}