import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        
        a = a*d;
        c = c*b;
        b = b*d;
        
        a = a+c;
        
        for(int i = 2; i <= a; i++){
            if(a%i==0){
                if(b%i==0){
                    a = a/i;
                    b = b/i;
                    i--;
                }
            }
        }
        
        bw.write(a + " " + b);
        bw.flush();
        bw.close();
    }    
}
