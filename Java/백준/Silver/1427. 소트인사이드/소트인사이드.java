import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        
        Integer[] arr = new Integer[10];
        
        for(int i = 0; i<10; i++){
            if(num>0){
                count++;
                arr[i] = num % 10;
                num /= 10;   
            }
            else{
                arr[i] = -1;
            }
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        int answer = 0;
        
        for(int i = 0; i<count; i++){
            if(arr[i]>=0){
                answer = answer*10 + arr[i];
            }
        }
        bw.write(answer+"\n");
        
        bw.flush();
        bw.close();
    }    
}
