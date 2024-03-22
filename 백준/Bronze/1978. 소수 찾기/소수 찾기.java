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
        
        st = new StringTokenizer(br.readLine(), " ");
        int count = 0;
        
        for(int i = 1; i<=num; i++){
            int is_that = Integer.parseInt(st.nextToken());
            if(is_that == 1){
                continue;
            }
            count++;
            
            for(int j = 2; j <= (int)Math.sqrt(is_that); j++){
                if(is_that % j == 0){
                    count--;
                    break;
                }
            }
        }
        
        bw.write(count+"\n");
        
        bw.flush();
        bw.close();
    }    
}
