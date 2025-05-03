import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];
        
        for(int i = 0; i<num; i++){
            arr[i] = br.readLine();
        }
        
        for(int i = 0; i<num-1; i++){
            for(int j = i+1; j<num; j++){
                if(arr[i].length()>arr[j].length()){
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                else if(arr[i].length() == arr[j].length()){
                    if(arr[i].compareTo(arr[j])>0){
                        String temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
        
        bw.write(arr[0]+"\n");
        for(int i = 1; i<num; i++){
            if(!arr[i].equals(arr[i-1])){
                bw.write(arr[i]+"\n");
            }
        }
        
        bw.flush();
        bw.close();
    }
}