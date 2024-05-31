import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        int root = (int) (Math.sqrt(Double.valueOf(max)));
        
        boolean[] arr = new boolean[max+1];
        arr[1] = true;
        for(int i = 2; i <= root; i++){
            for(int j = min; j <= max; j++){
                if(i < j && j%i == 0){
                    arr[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        
        for(int j = min; j <= max; j++){
            if(!arr[j]){
                 sb.append(j).append('\n');
            }
        }
        System.out.println(sb);
    }
}
