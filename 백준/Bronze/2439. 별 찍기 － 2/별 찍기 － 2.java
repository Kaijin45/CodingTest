import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int a = 1;
        
        while(a<=num){
            for(int b = 1; a+b<=num; b++){
                bw.write(" ");
            }
            for(int i = 1; i<=a; i++){
                bw.write("*");
            }
            a++;
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }    
}
