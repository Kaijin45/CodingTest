import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        if(K == 1){
            bw.write(1+"\n");
        }
        else{
            K--;
            int count = 1;
            
            while(K>0 && N>= count){
                count++;
                if(N%count == 0){
                    K--;
                }
            }
            
            if(K==0){
                bw.write(count+"\n");
            }
            else{
                bw.write(0+"\n");
            }
            
        }
        
        bw.flush();
        bw.close();
    }
}