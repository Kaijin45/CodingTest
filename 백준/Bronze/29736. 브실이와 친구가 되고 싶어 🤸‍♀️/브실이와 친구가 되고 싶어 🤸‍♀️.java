import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int my = Integer.parseInt(st.nextToken());
        int gab  = Integer.parseInt(st.nextToken());
        
        if(min > my + gab){
            bw.write("IMPOSSIBLE");
        }
        else if(max < my - gab){
            bw.write("IMPOSSIBLE");
        }
        else{
            if(min <= my - gab && my + gab <= max){
                gab = gab + gab + 1;
                bw.write(gab+"\n");
            }
            else if(min <= my - gab && my + gab > max){
                gab = max - (my - gab) + 1;
                bw.write(gab+"\n");
            }
            else if(min > my - gab && my + gab <= max){
                gab = (my + gab) - min + 1;
                bw.write(gab+"\n");
            }
            else{
                gab = max - min + 1;
                bw.write(gab+"\n");
            }
        }
        bw.flush();
        bw.close();
    }    
}
