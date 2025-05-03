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
                case "1":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "3":
                    sb.append(pop_front()).append('\n');
                    break;
                case "4":
                    sb.append(pop_back()).append('\n');
                    break;
                case "5":
                    sb.append(size()).append('\n');
                    break;
                case "6":
                    sb.append(empty()).append('\n');
                    break;
                case "7":
                    sb.append(top()).append('\n');
                    break;
                case "8":
                    sb.append(bottom()).append('\n');
            }
        }
        System.out.println(sb);
    }
    
    public static void push_front(int item){
        list.addFirst(item);
        size++;
    }
    
    public static void push_back(int item){
        list.addLast(item);
        size++;
    }
    
    public static int pop_front() {
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
    
    public static int pop_back() {
        if(size == 0) {
            return -1;
        }
        else{
            int res = list.get(size-1);
            list.removeLast();
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