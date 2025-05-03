import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        int ballon_number = Integer.parseInt(br.readLine());
        
        StringTokenizer st_token =
            new StringTokenizer(br.readLine()," ");
        Deque<Ballon> ballon_circle = new ArrayDeque<>();
        
        for(int i = 1; i<=ballon_number; i++){
            ballon_circle.addLast(new Ballon(i, Integer.parseInt(st_token.nextToken())));
        }
        
        Ballon ball = ballon_circle.removeFirst();
        
        StringBuilder st_build = new StringBuilder();
        st_build.append(ball.index);
        int count = ball.numValue;
                
        while(!ballon_circle.isEmpty()){
            if(count<0){
                for(int i = 1; i < -count; i ++){
                    ballon_circle.addFirst(ballon_circle.removeLast());
                }
                ball = ballon_circle.removeLast();
                count = ball.numValue;
            }
            else{
                for(int i = 1; i < count; i++){
                    ballon_circle.addLast(ballon_circle.removeFirst());
                }
                ball = ballon_circle.removeFirst();
                count = ball.numValue;
            }
            
            st_build.append(' ').append(ball.index);
        }
        
        System.out.println(st_build);
        
    }
}


class Ballon{
    int index;
    int numValue;
    
    public Ballon(int index, int numValue){
        this.index = index;
        this.numValue = numValue;
    }
}