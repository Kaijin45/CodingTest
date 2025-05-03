import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        int N_line = Integer.parseInt(st.nextToken());
        int M_num = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[N_line][M_num];
        
        for(int i = 0; i<2; i++){
            for(int j = 0; j<N_line; j++){
                
                st = new StringTokenizer(br.readLine(), " ");

                for(int k = 0; k<M_num; k++){
                    arr[j][k] += Integer.parseInt(st.nextToken());
                }
            }
        }
        
        for(int j = 0; j<N_line; j++){
            for(int k = 0; k<M_num; k++){
                bw.write(arr[j][k]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}