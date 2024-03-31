import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][2];
        
        for(int i = 0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        int[] arr2 = new int[num];
        
        for(int i = 0; i<num; i++){
            arr2[i] = 1;
        }
        
        for(int i =0; i<num; i++){
            for(int j = 0; j<num; j++){
                if(arr[i][0] < arr[j][0]){
                    if(arr[i][1] < arr[j][1]){
                        arr2[i]++;
                    }
                }
            }
        }
        
        String answer = "" + arr2[0];
        for(int i = 1; i<num; i++){
            answer = answer + " " + arr2[i];
        }
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}