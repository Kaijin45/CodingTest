import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<num; i++){
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(st.nextToken()).append(' ');
            
            int grade = Integer.parseInt(st.nextToken());
            
            if(grade>=97){
                sb.append("A+").append('\n');
            }
            else if(grade>=90){
                sb.append("A").append('\n');
            }
            else if(grade>=87){
                sb.append("B+").append('\n');
            }
            else if(grade>=80){
                sb.append("B").append('\n');
            }
            else if(grade>=77){
                sb.append("C+").append('\n');
            }
            else if(grade>=70){
                sb.append("C").append('\n');
            }
            else if(grade>=67){
                sb.append("D+").append('\n');
            }
            else if(grade>=60){
                sb.append("D").append('\n');
            }
            else{
                sb.append("F").append('\n');
            }
        }

        System.out.println(sb);
    }
}
