import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int King = Integer.parseInt(st.nextToken());
        int Queen = Integer.parseInt(st.nextToken());
        int Rook = Integer.parseInt(st.nextToken());
        int Bishop = Integer.parseInt(st.nextToken());
        int Knight = Integer.parseInt(st.nextToken());
        int pawn = Integer.parseInt(st.nextToken());
        
        String answer = "";
        
        King = 1 - King;
        Queen = 1 - Queen;
        Rook = 2 - Rook;
        Bishop = 2 - Bishop;
        Knight = 2 - Knight;
        pawn = 8 - pawn;
        
        answer = King + " " + Queen + " " + Rook + " " + Bishop + " " + Knight + " " + pawn;
        
        bw.write(answer+"\n");
        bw.flush();
        bw.close();
    }    
}
