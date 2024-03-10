import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<num; i++){
            st = new StringTokenizer(br.readLine());
        
            int Hour = Integer.parseInt(st.nextToken());
            int Min = Integer.parseInt(st.nextToken());  
            Hour = Hour + Min;
            
            String data = "Case #"+(i+1)+": "+Hour;
            
            sb.append(data).append("\n");
            
        }
        
        System.out.print(sb);
    }    
}