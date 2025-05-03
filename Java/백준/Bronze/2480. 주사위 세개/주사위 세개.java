import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int data;
        
        if(a==b && b ==c){
            data = 10000 + a*1000;
        }
        else if(a == b || a == c){
            data = 1000 + a*100;
        }
        else if(b==c){
            data = 1000 + b*100;
        }
        else if(a>b && a>c){
            data = a*100;
        }
        else if(b>a && b>c){
            data = b*100;
        }
        else{
            data = c*100;
        }
        
        System.out.print(data);
        
        //sb.append(data).append(" ");
        
        //System.out.print(sb);
    }    
}
