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
        
        while(true){
            st = new StringTokenizer(br.readLine(), " ");
        
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            if(a==0 && b==0 && c==0){
                break;
            }
            
            if(a+b<=c || a+c<=b || b+c<=a){
                bw.write("Invalid\n");
                continue;
            }
            
            
            if(a==b && b==c){
                bw.write("Equilateral\n");
            }
            else if(a!=b && a!=c && b!=c){
                bw.write("Scalene\n");
            }
            else{
                bw.write("Isosceles\n");
            }
        }
        
        bw.flush();
        bw.close();
    }    
}
