import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int End_Number = Integer.parseInt(br.readLine());
        Queue<Integer> card_Q = new LinkedList<>();
        
        for(int i = 1; i<=End_Number; i++){
            card_Q.add(i);
        }
        
        while(card_Q.size() != 1){
            card_Q.remove();
            card_Q.add(card_Q.remove());
        }
        
        int last_Card = card_Q.remove();
        
        bw.write(last_Card+"\n");
        bw.flush();
        bw.close();
    }
}