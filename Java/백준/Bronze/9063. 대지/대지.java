import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        if(num==1){
            bw.write("0\n");
        }
        else{
            int x = 10001;
            int y = 10001;
            int X = -10001;
            int Y = -10001;
            
            for(int i = 1; i<=num; i++){
                st = new StringTokenizer(br.readLine(), " ");
            
                int input_x = Integer.parseInt(st.nextToken());
                int input_y = Integer.parseInt(st.nextToken());
                
                if(input_x<x){
                    x = input_x;
                }
                if(input_x>X){
                    X = input_x;
                }
                
                if(input_y<y){
                    y = input_y;
                }
                if(input_y>Y){
                    Y = input_y;
                }
                
            }
            bw.write((X-x)*(Y-y)+"\n");
        }
        
        bw.flush();
        bw.close();
    }    
}
