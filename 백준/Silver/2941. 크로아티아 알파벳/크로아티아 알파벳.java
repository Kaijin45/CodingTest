import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        String X = br.readLine();
        
        char[] arr = X.toCharArray();
        int num = 0;
        
        for(int i = 0; i<X.length(); i++){
            if(arr[i]=='='){
                if(i>1 && arr[i-1] == 'z' && arr[i-2] == 'd'){
                    num--;
                    continue;
                }
                else{
                    continue;
                }
            }
            else if(arr[i] == '-'){
                continue;
            }
            else if(arr[i] == 'j' && i>0){
                if(arr[i-1] == 'n' || arr[i-1] == 'l'){
                    continue;
                }
            }
                
            num++;
        }
        
        bw.write(num + "\n");
        bw.flush();
        bw.close();
    }    
}
