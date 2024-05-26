import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
            
        for(int i = 0; i < num; i++){
            int a = Integer.parseInt(br.readLine());
            int out0 = 1;
            int out1 = 1;
            int temp1 = 0;
            
            if(a == 0){
                sb.append("1 0\n");
                continue;
            }
            if(a == 1){
                sb.append("0 1\n");
                continue;
            }
            
            while(a-- > 2){
                temp1 = out1;
                out1 = out1 + out0;
                out0 = temp1;
            }
            
            sb.append(out0).append(' ').append(out1).append('\n');
        }
        
        System.out.println(sb);
    }
}