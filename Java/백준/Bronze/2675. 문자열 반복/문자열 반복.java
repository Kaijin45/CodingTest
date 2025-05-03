import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        //the number of testcase -> get it
        int num = Integer.parseInt(br.readLine());
        
        // repeat it.
        for(int i = 1; i<=num; i++){
            
            // 1. get a new line
            st = new StringTokenizer(br.readLine(), " ");
            
            // 2. split it with blank
            int repeatN = Integer.parseInt(st.nextToken());
            String Str = st.nextToken();
            
            // 3. define empty string to print out
            String change = "";
            
            // 4. repeat each character
            for(char c : Str.toCharArray()){
                
                // 5. repeat it with repeatN times.
                for(int j = 0; j<repeatN; j++){
                    // 6. add one character to change
                    change = change + Character.toString(c);
                }
            }
            bw.write(change+"\n");
        }
        
        bw.flush();
        bw.close();
    }    
}
