import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        
        a = a*a;
        b = b*b;
        
        a = a - b;
        
        bw.write(a+"\n");
        
        bw.flush();
        bw.close();
    }    
}
