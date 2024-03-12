import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        String inX = br.readLine();
        int check = 1;
        
        if(inX.length() == 1){
            bw.write(1+"\n");
        }
        else{
            for(int i = 0; i<(inX.length()/2); i++){
                if(inX.charAt(i) == inX.charAt(inX.length()-1-i) ){
                    continue;
                }
                else{
                    check = 0;
                    break;
                }
            }
            bw.write(check +"\n");
        }
        
        bw.flush();
        bw.close();
    }    
}
