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
        int[][] arr = new int[100][100];
        
        for(int i = 0; i<num; i++){
            
            st = new StringTokenizer(br.readLine(), " ");
        
            int Hour = Integer.parseInt(st.nextToken());
            int Min = Integer.parseInt(st.nextToken());
            
            for(int j = Hour-1; j < Hour + 9; j++){
                for(int k = Min -1; k < Min +9; k++){
                    arr[j][k] = 1;
                }
            }
        }
        
        int answer = 0;
        
        for(int i = 0; i < 100; i++){
            for(int j = 0; j <100; j++){
                answer += arr[i][j];
            }
        }
        
        
        bw.write(answer+"\n");
        bw.flush();
        bw.close();
    }    
}
