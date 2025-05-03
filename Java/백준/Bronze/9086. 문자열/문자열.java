import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        char St = ' ';
        char Ed = ' ';
        int leng = 0;
        
        for(int i = 0; i<num; i++){
            String inputX = br.readLine();
            St = inputX.charAt(0);
            leng = inputX.length();
            Ed = inputX.charAt(leng-1);
            inputX = Character.toString(St)+Character.toString(Ed);
            bw.write(inputX+"\n");
        }
        bw.flush();
        bw.close();
    }    
}