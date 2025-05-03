import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine(), " ");
        
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long rem_A = A;
        long rem_B = B;
        long result = 0;
        
        while(B != 0){
            long temp = B;
            B = A % B;
            A = temp;
        }
        
        result = rem_A * rem_B / A;
        System.out.println(result);
    }
}