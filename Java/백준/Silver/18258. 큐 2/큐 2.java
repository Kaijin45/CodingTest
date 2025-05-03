import java.io.*;
import java.util.*;

public class Main{
    public static LinkedList<Integer> list = new LinkedList<>();
    public static int size = 0;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int Command_Num = Integer.parseInt(br.readLine());
        
        while(Command_Num-- > 0){
            st = new StringTokenizer(br.readLine(), " ");
            
            switch(st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "front":
                    sb.append(top()).append('\n');
                    break;
                case "back":
                    sb.append(bottom()).append('\n');
            }
        }
        System.out.println(sb);
    }
    
    public static void push(int item){
        list.addLast(item);
        size++;
    }
    
    public static int pop() {
        if(size == 0) {
            return -1;
        }
        else{
            int res = list.get(0);
            list.removeFirst();
            size--;
            return res;
        }
    }
    
    public static int size() {
        return size;
    }
    
    public static int empty() {
        if(size == 0){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public static int top() {
        if(size == 0){
            return -1;
        }
        else{
            return list.get(0);
        }
    }
    
    public static int bottom() {
        if(size == 0){
            return -1;
        }
        else{
            return list.get(size-1);
        }
    }
}
