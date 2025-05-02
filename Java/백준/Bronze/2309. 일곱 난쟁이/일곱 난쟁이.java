import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[9];
        
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        int num1 = 0;
        int num2 = 1;
        int total = 0;
        
        while(true){
            total = 0;
            for(int i = 0; i < 9; i++){
                if(i != num1 && i != num2){
                    total += arr[i];
                }
            }
            if(total == 100){
                break;
            }
            else{
                if(num2 == 8){
                    num1++;
                    num2 = num1 + 1;
                }
                else{
                    num2++;
                }
            }
        }
        
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(int i = 0; i < 9; i++){
            if(i != num1 && i != num2){
                bw.write(arr[i]+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}