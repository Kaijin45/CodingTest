import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        int DS_num = Integer.parseInt(br.readLine());
        boolean[] DS_num_arr = new boolean[DS_num];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < DS_num; i++){
            if(Integer.parseInt(st.nextToken()) == 0){
                DS_num_arr[i] = true;
            }
            else{
                DS_num_arr[i] = false;
            }
        }
        
        LinkedList<Integer> list = new LinkedList<>();
        st = new StringTokenizer(br.readLine(), " ");
        int num = 0;
        
        for(int i = 0; i < DS_num; i++){
            num = Integer.parseInt(st.nextToken());
            if(DS_num_arr[i]){
                list.addFirst(num);
            }
        }
        
        int total = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < total; i++){
            num = Integer.parseInt(st.nextToken());
            list.addLast(num);
            num = list.removeFirst();
            sb.append(num).append(' ');
        }
        System.out.println(sb);
    }
}