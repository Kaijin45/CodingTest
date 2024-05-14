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
        long total_length = 0;
        
        for(int i = 1; i< city_num; i++){
            total_length += Integer.parseInt(st.nextToken());
        }
        
        bw.write(total_length+"\n");
        bw.flush();
        bw.close();
    }
}