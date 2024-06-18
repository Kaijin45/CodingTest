import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine()," ");
        
        int loop = Integer.parseInt(st.nextToken());
        String prizer = st.nextToken();
        int checker = 0;
        int loser = 0;
        String[] arr = new String[loop];
        
        for(int i = 0; i < loop; i++){
            st = new StringTokenizer(reader.readLine()," ");
            if(prizer.equals(st.nextToken())){
                checker = i;
                arr[i] = st.nextToken();
                break;
            }
            arr[i] = st.nextToken();
        }
        
        for(int j = 0; j < checker; j++){
            if(arr[j].equals(arr[checker])){
                loser++;
            }
        }
        
        BufferedWriter writer =
            new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(loser+"\n");
        writer.flush();
        writer.close();
    }
}