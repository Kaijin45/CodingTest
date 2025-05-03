import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        String data;
        
        for(int i = 1; i<10; i++){
            
            data = N + " * " + i + " = " + N*i;
            sb.append(data).append("\n");
        }
        
        
        System.out.print(sb);
    }    
}
