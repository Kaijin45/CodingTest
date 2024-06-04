import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int[] standard = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<num; i++){
            standard[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(standard);

        int che = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
    
        for(int i = 0; i < che; i++){
            int a = Integer.parseInt(st.nextToken());
            sb.append(binarySearch1(standard, a, 0, num-1)).append('\n');
        }
        
        System.out.println(sb);
    }
    
    
    public static int binarySearch1(int[] arr, int wantValue, int low, int high){
        int mid;
        
        if(low <= high){
            mid = (low + high) / 2;
            
            if(wantValue == arr[mid]){
                return 1;
            }
            else if(wantValue < arr[mid]){
                return binarySearch1(arr, wantValue, low, mid-1);
            }
            else{
                return binarySearch1(arr, wantValue, mid+1, high);
            }
        }
        
        return 0;
    }
    
}
