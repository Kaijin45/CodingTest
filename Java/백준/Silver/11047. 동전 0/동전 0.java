import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[a];
        
        for(int i = 0; i<a; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int count = 0;
        a--;
        
        while(b!=0){
            if(b>=arr[a]){
                b = b - arr[a];
                count++;
            }
            else{
                a--;
            }
        }
        
        bw.write(count+"\n");
        bw.flush();
        bw.close();
    }    
}

