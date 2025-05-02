import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            String check = br.readLine();
            
            if(check.equals("0")){
                break;
            }
            
            int leng = check.length();
            boolean is_it = true;
            
            for(int i = 0; i < leng/2; i++){
                if(check.charAt(i) != check.charAt(leng-1-i)){
                    sb.append("no").append('\n');
                    is_it = false;
                    break;
                }
            }
            
            if(is_it){
                sb.append("yes").append('\n');
            }
        }
        
        System.out.println(sb);
    }
}