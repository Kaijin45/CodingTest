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
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        if(a+b>c && a+c>b && b+c>a){
            bw.write(a+b+c+"\n");
        }
        else{
            if(a+b<=c){
                bw.write(a+b+a+b-1+"\n");
            }
            else if(a+c<=b){
                bw.write(a+c+a+c-1+"\n");
            }
            else if(b+c<=a){
                bw.write(b+c+b+c-1+"\n");
            }
        }
        
        bw.flush();
        bw.close();
    }    
}
