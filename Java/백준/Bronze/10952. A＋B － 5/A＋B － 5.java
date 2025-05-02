import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = 3;
        
        while(a == 3){
            st = new StringTokenizer(br.readLine());
        
            int Hour = Integer.parseInt(st.nextToken());
            int Min = Integer.parseInt(st.nextToken());
            
            if(Hour == Min && Min == 0){
                a = 0;
            }
            else{
                Hour = Hour + Min;
                bw.write(Hour+"\n");
            }
            
        }
        
        bw.flush();
        bw.close();
    }    
}
