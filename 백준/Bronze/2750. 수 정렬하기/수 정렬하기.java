import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        int[] arr = new int[num];
        
        for(int i = 0; i<num; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i = 0; i<num-1; i++){
            for(int j = i+1; j<num; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(int i : arr){
            bw.write(i+"\n");
        }
        
        bw.flush();
        bw.close();
    }    
}
