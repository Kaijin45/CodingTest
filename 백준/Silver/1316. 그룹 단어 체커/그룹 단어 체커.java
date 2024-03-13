import java.io.*;
import java.util.*;
import java.lang.Object;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        
        for(int i = 0; i<num; i++){        
            Set<Character> values = new HashSet<>();
            String s = br.readLine();
            char rem = ' ';
            
            for (char c : s.toCharArray()) {
                if(rem == c){
                    continue;
                }
                else{
                    if(values.contains(c)){
                        answer++;
                        break;
                    }
                    else{
                        values.add(c);
                        rem = c;
                        continue;
                    }
                }
            }
            
        }
        
        bw.write((num - answer)+"\n");
        bw.flush();
        bw.close();
    }    
}
