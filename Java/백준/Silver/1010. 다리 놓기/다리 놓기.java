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
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 1; i<=num; i++){
            st = new StringTokenizer(br.readLine(), " ");
        
            int west = Integer.parseInt(st.nextToken());
            int east = Integer.parseInt(st.nextToken());
            
            long cal = 1;
            
            for(int j = 1; j<= west; j++){
                cal = cal*(east - j+1);
                cal = cal/j;
            }
            
            String a = Long.toString(cal);
            bw.write(a);
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }    
}
