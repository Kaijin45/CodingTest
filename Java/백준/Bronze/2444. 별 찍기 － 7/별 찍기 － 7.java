import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 1; i<=(2*num -1); i++){
            if(i<num){
                for(int j = 1; j <= (num - i); j++){
                    bw.write(" ");
                }
                for(int k = 1; k <= (2*i - 1); k++){
                    bw.write("*");
                }
                bw.write("\n");
            }
            else if(i==num){
                for(int a = 1; a <= (2*i - 1); a++){
                    bw.write("*");
                }
                bw.write("\n");
            }
            else{
                for(int b = 1; b <= (i - num); b++){
                    bw.write(" ");
                }
                for(int c = 1; c <= (4*num - 2*i - 1); c++){
                    bw.write("*");
                }
                bw.write("\n");
            }
        }
        
        bw.flush();
        bw.close();
    }    
}
