import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            st = new StringTokenizer(br.readLine(), " ");
        
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if(a==0 && b==0){
                break;
            }
            else{
                if(a%b==0){
                    bw.write("multiple\n");
                }
                else if(b%a==0){
                    bw.write("factor\n");
                }
                else{
                    bw.write("neither\n");
                }
            }
        }

        
        bw.flush();
        bw.close();
    }    
}