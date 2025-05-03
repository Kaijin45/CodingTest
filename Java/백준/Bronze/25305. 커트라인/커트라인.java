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
        
        int test_people = Integer.parseInt(st.nextToken());
        int cut_line = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[test_people];
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i<test_people; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i<test_people - 1; i++){
            for(int j = i+1; j<test_people; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        cut_line--;
        bw.write(arr[cut_line]+"\n");
        
        bw.flush();
        bw.close();
    }    
}
