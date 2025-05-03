import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb  = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<num; i++){
            st = new StringTokenizer(br.readLine(), " ");
            
            int much = Integer.parseInt(st.nextToken());
            Double total = much * 350.34;
            
            much = Integer.parseInt(st.nextToken());
            total += much * 230.90;
            
            much = Integer.parseInt(st.nextToken());
            total += much * 190.55;
            
            much = Integer.parseInt(st.nextToken());
            total += much * 125.30;
            
            much = Integer.parseInt(st.nextToken());
            total += much * 180.90;
            
            sb.append("$").append(String.format("%.2f", total)).append('\n');
        }
        System.out.println(sb);
    }    
}
