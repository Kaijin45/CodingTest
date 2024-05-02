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
        
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        
        long total = max - min + 1;
        boolean[] check = new boolean[(int)total];
        
        for(long i = 2; i*i<=max; i++){
            long pow = i*i;
            long temp = min/pow;
            if(min%pow != 0){
                temp++;
            }
            for(long j = temp; j*pow<=max; j++){
                int canSqrt = (int)(j*pow-min);
                if(!check[canSqrt]){
                    check[canSqrt] = true;
                    total--;
                }
            }
        }
        
        bw.write(total+"\n");
        bw.flush();
        bw.close();
    }
}