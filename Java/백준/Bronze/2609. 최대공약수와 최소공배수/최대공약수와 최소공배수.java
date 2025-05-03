import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int ka = a;
        int kb = b;
        
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        b = ka * kb / a;
        
        System.out.println(a);
        System.out.println(b);
    }
}