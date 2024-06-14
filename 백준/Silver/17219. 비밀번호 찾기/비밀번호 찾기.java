import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int siteNum = Integer.parseInt(st.nextToken());
        int requestNum = Integer.parseInt(st.nextToken());
        
        HashMap<String, String> sitePwdMap = new HashMap<String,String>();
        
        for(int i = 0; i<siteNum; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String site = st.nextToken();
            sitePwdMap.put(site, st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < requestNum; i++){
            String pwd = sitePwdMap.get(br.readLine());
            sb.append(pwd).append('\n');
        }
        
        System.out.println(sb);
       }
}
