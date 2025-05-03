import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[5];
        
        arr[0] = Integer.parseInt(br.readLine());
        arr[1] = Integer.parseInt(br.readLine());
        arr[2] = Integer.parseInt(br.readLine());
        arr[3] = Integer.parseInt(br.readLine());
        arr[4] = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<4; i++){
            for(int j = i+1; j<5; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        int sum = arr[0] + arr[1] + arr[2] +arr[3]+arr[4];
        sum /= 5;
        bw.write(sum+"\n");
        bw.write(arr[2]+"\n");
        
        bw.flush();
        bw.close();
    }    
}
