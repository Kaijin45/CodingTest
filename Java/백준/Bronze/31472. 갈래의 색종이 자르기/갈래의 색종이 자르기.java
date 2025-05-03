import java.io.*;
import java.lang.Math;


public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
       
        int num = Integer.parseInt(br.readLine());
        num /= 2;
        
        num = (int)Math.sqrt(Double.valueOf(num));
        
        num *= 8;
        
        bw.write(num+"\n");
        bw.flush();
        bw.close();
    }
}
