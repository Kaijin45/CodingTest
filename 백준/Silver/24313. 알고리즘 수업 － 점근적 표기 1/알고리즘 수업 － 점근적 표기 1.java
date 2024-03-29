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
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());
        
        int c = Integer.parseInt(br.readLine());
        
        int n0 = Integer.parseInt(br.readLine());
            
        c = c - a1;
        if(c<0){
            bw.write("0\n");
        }
        else if(c==0){
            if(a2>0){
                bw.write("0\n");
            }
            else{
                bw.write("1\n");
            }
        }
        else{
            if(c*n0 - a2 >=0){
                bw.write("1\n");
            }
            else{
                bw.write("0\n");
            }
        }
        
        bw.flush();
        bw.close();
    }    
}
