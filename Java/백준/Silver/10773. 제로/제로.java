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
        
        int count = 0;
        int temp = 0;
        
        for(int i = 0; i<num; i++){
            temp = Integer.parseInt(br.readLine());
            if(temp != 0){
                arr[count] = temp;
                count++;
            }
            else{
                count--;
                arr[count] = 0;
            }
        }
        
        temp = 0;
        
        for(int i = 0; i<num; i++){
            temp = temp + arr[i];
        }
        
        bw.write(temp+"\n");
        
        bw.flush();
        bw.close();
    }    
}
