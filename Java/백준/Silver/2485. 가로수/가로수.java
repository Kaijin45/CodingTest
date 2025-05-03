import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];
        arr[0] = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < total; i++){
            arr[i] = Integer.parseInt(br.readLine());
            arr[i-1] = arr[i] - arr[i-1];
            if(arr[i-1] < min){
                min = arr[i-1];
            }
        }
        
        int need = 0;
        
        while(true){
            boolean check = true;
            need = 0;
            
            for(int i = 0; i < total-1; i++){
                if(arr[i]%min != 0){
                    check = false;
                    break;
                }
                need += arr[i]/min - 1;
            }
            
            if(check){
                break;
            }
            min--;
        }
        
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(need+"\n");
        bw.flush();
        bw.close();
    }
}