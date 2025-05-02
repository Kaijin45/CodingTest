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
        
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int result = 1;
            
            for(int j = 0; j<b; j++){
                result = (result*a)%10;
            }
            
            if(result==0){
                result = 10;
            }
            
            bw.write(result+"\n");
        }
        
        bw.flush();
        bw.close();
    }    
}
