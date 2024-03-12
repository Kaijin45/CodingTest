import java.io.*;
import java.util.Map.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        String x = br.readLine();
        x = x.toUpperCase();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i<x.length(); i++){
            if(map.containsKey(x.charAt(i))){
                int a = map.get(x.charAt(i));
                a++;
                map.put(x.charAt(i), a);
            }
            else{
                map.put(x.charAt(i), 1);
            }
        }
        
        char answer = ' ';
        int keyValue = 0;
        
        for(Entry<Character, Integer> entry : map.entrySet()){
            if(keyValue < entry.getValue()){
                answer = entry.getKey();
                keyValue = entry.getValue();
            }
            else if(keyValue == entry.getValue()){
                answer = '?';
            }
            else{
                continue;
            }
        }
        
        bw.write(answer+"\n");
                bw.flush();
        bw.close();

    }
}