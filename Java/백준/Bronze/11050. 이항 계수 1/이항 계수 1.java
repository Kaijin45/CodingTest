import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int answer = 1;
        
        for(int i = a; i>1; i--){
            answer *= i;
        }
        
        for(int i = b; i>=1; i--){
            answer = answer/i;
        }
        
        for(int i = a-b; i>=1; i--){
            answer = answer/i;
        }
        
        bw.write(answer+"\n");
        bw.flush();
        bw.close();
    }    
}
