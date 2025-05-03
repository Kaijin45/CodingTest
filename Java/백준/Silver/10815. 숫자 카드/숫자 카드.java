import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashMap<Integer, Integer> rankingMap =
            new HashMap<Integer,Integer>();
        
        int num = Integer.parseInt(br.readLine());
        int[] origin = new int[num];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i<num; i++){
            origin[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(origin);
        int rank = 1;
        for(int v : origin){
            if(!rankingMap.containsKey(v)){
                rankingMap.put(v, rank);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        num = Integer.parseInt(br.readLine());
        int[] test = new int[num];
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i<num; i++){
            test[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i<num; i++){
            int ranking = 0;
            if(rankingMap.containsKey(test[i])){
                ranking = rankingMap.get(test[i]);
            }
            sb.append(ranking).append(' ');
        }
        
        System.out.println(sb);
       }
}