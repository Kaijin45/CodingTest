import java.io.*;
import java.util.*;

public class Main{
    static int width;
    static int height;
    static int vet_num;
    static int answer;
    static char[][] cabbage;
    static char[][] visit;
    static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };
    
    public static void dfs(int x, int y){
        visit[x][y] = '1';
        
        for(int i = 0; i < 4; i++){
            int cW = x + dx[i];
            int cH = y + dy[i];
            
            if(cW >= 0 && cH >= 0 && cW < width && cH < height){
                if(visit[cW][cH] != '1' && cabbage[cW][cH] == '1'){
                    dfs(cW, cH);
                }
            }
        }
    }
    
    
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw =
          //  new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int testcase_num = Integer.parseInt(br.readLine());
        
        while(testcase_num-- > 0){
            st = new StringTokenizer(br.readLine(), " ");
            
            width = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());
            vet_num = Integer.parseInt(st.nextToken());
            cabbage = new char[width][height];
            visit = new char[width][height];
            
            for(int i = 0; i < vet_num; i++){
                st = new StringTokenizer(br.readLine(), " ");
                int w = Integer.parseInt(st.nextToken());
                int h = Integer.parseInt(st.nextToken());
                cabbage[w][h] = '1';
            }
            
            answer = 0;
            
            for(int i = 0; i < width; i++){
                for(int j = 0; j < height; j++){
                    if(visit[i][j] != '1' && cabbage[i][j] == '1'){
                        dfs(i, j);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
            //bw.write(answer+'\n');
        }
        
        //bw.flush();
        //bw.close();
    }
}
