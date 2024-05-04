import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        int[] origin = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<num; i++){
            origin[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        
        Arrays.sort(origin);
        int sum = 0;
        
        for(int i =0; i<num; i++){
            for(int j = 0; j<=i; j++){
                sum += origin[j];
            }
        }
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write(sum+"\n");
        bw.flush();
        bw.close();
    }
}