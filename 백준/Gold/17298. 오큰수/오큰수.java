import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        int[] idx = new int[num];
        
        StringTokenizer st =
            new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            idx[i] = -1;
        }
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < num; i++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                int bigleft_adjusted = stack.pop();
                idx[bigleft_adjusted] = arr[i];
            }
            stack.push(i);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++){
            sb.append(idx[i]).append(' ');
        }        
        
        System.out.println(sb);
        
    }
}