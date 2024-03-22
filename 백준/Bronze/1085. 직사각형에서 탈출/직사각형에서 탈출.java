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
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        int short_cut = x;
        if(x>y){
            short_cut = y;
        }
        
        if(w-x<short_cut){
            short_cut = w-x;
        }
        
        if(h-y<short_cut){
            short_cut = h-y;
        }
        bw.write(short_cut+"\n");
        
        bw.flush();
        bw.close();
    }    
}
