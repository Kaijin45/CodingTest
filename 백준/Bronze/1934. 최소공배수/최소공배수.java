import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++){
            st = new StringTokenizer(br.readLine(), " ");
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int ka = a;
            int kb = b;
            
            while(b != 0){
                int temp = b;
                b = a % b;
                a = temp;
            }
            
            b = ka * kb / a;
            bw.write(b+"\n");
        }
        
        bw.flush();
        bw.close();
    }
}