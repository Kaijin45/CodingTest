import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int city_num = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long[] length = new long[city_num-1];
        for(int i = 0; i< city_num-1; i++){
            length[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        long[] cost = new long[city_num];
        for(int i = 0; i < city_num; i++){
            cost[i] = Integer.parseInt(st.nextToken());
        }
        
        long lowest_cost = cost[0];
        long total_cost = 0;
        
        for(int i = 0; i < city_num-1; i++){
            if(lowest_cost > cost[i]){
                lowest_cost = cost[i];
            }
            total_cost += lowest_cost * length[i]; 
        }
        
        bw.write(total_cost+"\n");
        bw.flush();
        bw.close();
    }
}