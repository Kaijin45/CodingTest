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
        
        char[][] arr = new char[N][M];
        
        for(int i = 0; i<N; i++){
            String temp = br.readLine();
            
            for(int j =0; j<M; j++){
                arr[i][j] = temp.charAt(j);
            }
        }
        
        int min_count = 65;
        int count = 0;
            
        for(int i = 0; i< N-7; i++){
            for(int j = 0; j < M-7; j++){
                
                
                count = 0;
                
                for(int k = i; k<i+8; k++){
                    for(int l = j; l<j+8; l++){
                        if((k+l)%2 ==0){
                            if(arr[k][l] != 'W'){
                                count++;
                            }
                        }
                        else{
                            if(arr[k][l] != 'B'){
                                count++;
                            }
                        }
                    }
                }
                
                if(count<min_count){
                    min_count = count;
                }
                
                
                count = 0;
                
                for(int k = i; k<i+8; k++){
                    for(int l = j; l<j+8; l++){
                        if((k+l)%2 ==0){
                            if(arr[k][l] != 'B'){
                                count++;
                            }
                        }
                        else{
                            if(arr[k][l] != 'W'){
                                count++;
                            }
                        }
                    }
                }
                
                if(count<min_count){
                    min_count = count;
                }
                    
            }
        }
        
        
        bw.write(min_count+"\n");
        bw.flush();
        bw.close();
    }    
}
