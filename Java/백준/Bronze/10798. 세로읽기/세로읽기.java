import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[][] arr = new char[5][15];
        
        for(int i = 0; i<5; i++){
            String a = br.readLine();
            
            for(int j = 0; j<a.length(); j++){
                arr[i][j] = a.charAt(j);
            }
        }
        
        String answer = "";
        
        for(int i = 0; i<15; i++){
            for(int j = 0; j<5; j++){
                if(arr[j][i] == '\0')  continue;
                answer = answer + arr[j][i];
            }
        }
        
        bw.write(answer+"\n");
        bw.flush();
        bw.close();
    }    
}
