import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        int day_count = (V-A)/(A-B);
        int temp = (V-A)%(A-B);
        
        day_count++;
        
        if(temp!=0){
            day_count++;
        }
        
        bw.write(day_count+"\n");
        bw.flush();
        bw.close();
        
    }
}