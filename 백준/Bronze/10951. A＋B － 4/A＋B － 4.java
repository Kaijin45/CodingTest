import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(br.ready()){
            st = new StringTokenizer(br.readLine());
        
            int Hour = Integer.parseInt(st.nextToken());
            int Min = Integer.parseInt(st.nextToken());
        
            Hour += Min;
            bw.write(Hour+"\n");
        }
        
        bw.flush();
        bw.close();
    }    
}
