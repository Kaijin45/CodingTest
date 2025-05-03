import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        int[] origin = new int[num];
        int[] sorted = new int[num];
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer,Integer>();
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<num; i++){
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);
        int rank = 0;
        for(int v : sorted){
            if(!rankingMap.containsKey(v)){
                rankingMap.put(v, rank);
                rank++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int key : origin){
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        }
        
        System.out.println(sb);
       }
}