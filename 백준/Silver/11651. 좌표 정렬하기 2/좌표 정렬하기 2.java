import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][2];
        
        for(int i = 0; i<num; i++){
            st = new StringTokenizer(br.readLine(), " ");
        
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        int temp = 0;
        
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                return o1[1]!=o2[01] ? o1[1]-o2[1] : o1[0]-o2[0];
            }
        });
        
        for(int i = 0; i<num; i++){
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }
        
        bw.flush();
        bw.close();
    }
}
