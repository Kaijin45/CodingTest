import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int numN = Integer.parseInt(st.nextToken());
        int numM = Integer.parseInt(st.nextToken());
        
        HashMap<String, Integer> SetS =
            new HashMap<String,Integer>();
        
        for(int i = 0; i<numN; i++){
            String k = br.readLine();
            if(!SetS.containsKey(k)){
                SetS.put(k, 1);
            }
        }
        
        int check = 0;
        
        for(int i = 0; i<numM; i++){
            String k = br.readLine();
            if(SetS.containsKey(k)){
                check++;
            }
        }
        
        bw.write(check+"\n");
        bw.flush();
        bw.close();
       }
}