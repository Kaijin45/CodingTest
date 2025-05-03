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
        
        String A = st.nextToken();
        String B = st.nextToken();
        
        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        
        char temp = arrA[0];
        arrA[0] = arrA[2];
        arrA[2] = temp;
        
        temp = arrB[0];
        arrB[0] = arrB[2];
        arrB[2] = temp;
        
        A = String.valueOf(arrA);
        B = String.valueOf(arrB);
        
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        
        if(a>b){
            bw.write(a+"\n");
        }
        else bw.write(b+"\n");
        
        
        
        bw.flush();
        bw.close();
    }    
}
