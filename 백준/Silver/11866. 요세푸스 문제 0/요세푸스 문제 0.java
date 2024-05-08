import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader buffer_reader =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st_token = new StringTokenizer(buffer_reader.readLine());
        
        int yo_N = Integer.parseInt(st_token.nextToken());
        int yo_K = Integer.parseInt(st_token.nextToken());
        
        Queue<Integer> Circular = new LinkedList<>();
        
        for(int i = 1; i <= yo_N; i++){
            Circular.add(i);
        }
        
        StringBuilder string_build = new StringBuilder();
        
        string_build.append('<');
        
        int count = 1;
        
        while(Circular.size() != 1){
            if(count == yo_K){
                string_build.append(Circular.remove());
                string_build.append(',').append(' ');
                count = 1;
            }
            else{
                Circular.add(Circular.remove());
                count++;
            }
        }
        
        string_build.append(Circular.remove()).append('>');
        System.out.println(string_build);
        
    }
}