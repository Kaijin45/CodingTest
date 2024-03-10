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
        
        if(Min>44){
            Min = Min - 45;
            k = Hour + " " + Min;
        }
        else if(Hour == 0){
            Hour = 23;
            Min = Min + 15;
            k = Hour + " " + Min;
        }
        else{
            Hour = Hour -1;
            Min = Min + 15;
            k = Hour + " " + Min;
        }
        
        System.out.print(k);
    }    
}

