import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        st = new StringTokenizer(br.readLine(), " ");
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int answer = 0;
        
        
        Set<Character> set = new HashSet<>(10);
        set.add('0');
        set.add('9');
        set.add('8');
        set.add('7');
        set.add('6');
        set.add('5');
        set.add('4');
        set.add('3');
        set.add('2');
        set.add('1');
        
        int n = N.length();
        
        for(char s : N.toCharArray()){
            n--;
            if(set.contains(s)){
                answer += (s - 48)*Math.pow(B, n);
            }
            else{
                answer += (s - 55)*Math.pow(B, n);
            }
        }
        bw.write(answer+"\n");
        
        bw.flush();
        bw.close();
    }    
}
