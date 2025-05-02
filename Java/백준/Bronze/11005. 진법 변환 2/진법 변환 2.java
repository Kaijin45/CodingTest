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
        
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        String answer = "";
        char R = ' ';
        int rest = 0;
        
        while(N > 0){
            rest = N%B;
            N = N/B;
            if(rest<10){
                answer = rest + answer;
            }
            else{
                R = (char)(rest - 10 + 'A');
                answer = R + answer;
            }
            
        }
        
        
        bw.write(answer+"\n");
        
        bw.flush();
        bw.close();
    }    
}