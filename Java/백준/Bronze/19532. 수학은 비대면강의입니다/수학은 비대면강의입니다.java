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
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        
        int check = 0;
        int x = 10000;
        int y = 10000;
        
        for(int i = -999; i<1000; i++){
            for(int j = -999; j<1000; j++){
                if(a*i+b*j == c){
                    if(d*i+e*j == f){
                        x = i;
                        y = j;
                        check = 1;
                        break;
                    }
                }
            }
            if(check==1){
                break;
            }
        }
        
        bw.write(x+" "+y+"\n");
        bw.flush();
        bw.close();
    }    
}
