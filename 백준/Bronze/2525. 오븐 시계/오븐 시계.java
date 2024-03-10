import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        
        int Hour = Integer.parseInt(st.nextToken());
        int Min = Integer.parseInt(st.nextToken());
        String k;
        
        int during = Integer.parseInt(br.readLine());
        int H;
        
        Min = Min + during;
        H = Min / 60;
        Min = Min % 60;
        Hour = Hour + H;
        
        if(Hour>23){
            Hour = Hour - 24;
        }
            
        
        System.out.print(Hour + " " + Min);
        
    }    
}
