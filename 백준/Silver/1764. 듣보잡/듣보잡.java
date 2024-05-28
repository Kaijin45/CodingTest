import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int Nhear = Integer.parseInt(st.nextToken());
        int Nsee = Integer.parseInt(st.nextToken());
        
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i < Nhear; i++){
            set.add(br.readLine());
        }
        
        String[] arr = new String[Nsee];
        int j = 0;
        
        for(int i = 0; i < Nsee; i++){
            String s = br.readLine();
            if(set.remove(s)){
                arr[j] = s;
                j++;
            }
        }
        set.clear();
        
        String[] arr1 = new String[j];
        for(int i = 0; i < j; i++){
            arr1[i] = arr[i];
        }
        
        Arrays.sort(arr1);
        
        StringBuilder sb = new StringBuilder();
        sb.append(j).append('\n');
        
        for(int i = 0; i < j; i++){
            sb.append(arr1[i]).append('\n');
        }
        
        System.out.println(sb);
        
    }
}