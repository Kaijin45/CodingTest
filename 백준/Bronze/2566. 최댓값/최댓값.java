import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int row = 0;
        int column = 0;
        int max_N = 0;
        
        for(int i = 0; i<9; i++){
            st = new StringTokenizer(br.readLine(), " ");
            
            for(int j = 0; j<9; j++){
                int check = Integer.parseInt(st.nextToken());
                if(check > max_N){
                    row = i;
                    column = j;
                    max_N = check;
                }
                
            }
        }
        row++;
        column++;
        
        bw.write(max_N + "\n");
        bw.write(row + " " + column);
        
        bw.flush();
        bw.close();
    }    
}
