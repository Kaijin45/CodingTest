import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        String inputX = br.readLine();
        int num = Integer.parseInt(br.readLine());
        
        
        bw.write(inputX.charAt(num-1)+"\n");
        
        bw.flush();
        bw.close();
    }    
}
