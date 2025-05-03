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
        
        
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
            
        
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        
        int sum = 0;
        
        for(int i = 0; i<N-2; i++){
            for(int j = i+1; j<N-1; j++){
                for(int k = j+1; k<N; k++){
                    if(arr[i]+arr[j]+arr[k]<=M && arr[i]+arr[j]+arr[k]>sum){
                        sum = arr[i]+arr[j]+arr[k];
                    }
                }
            }
        }
        
        bw.write(sum+"\n");
        
        bw.flush();
        bw.close();
    }    
}
