import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(st.nextToken());
        int what = Integer.parseInt(st.nextToken());
        
        HashMap<Integer, String> map = new HashMap<>(num);
        HashMap<String, Integer> map2 = new HashMap<>(num);
        
        for(int i = 1; i <= num; i++){
            String temp = br.readLine();
            map.put(i, temp);
            map2.put(temp, i);
        }
        
        for(int i = 1; i <= what; i++){
            String s = br.readLine();
            Character c = s.charAt(0);
            
            if(Character.isDigit(c)){
                int s_i = Integer.parseInt(s);
                sb.append(map.get(s_i)).append('\n');
            }
            else{
                sb.append(map2.get(s)).append('\n');
            }
            
        }
        System.out.println(sb);
        
    }
}