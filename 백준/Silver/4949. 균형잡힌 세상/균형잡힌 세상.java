import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        String a = br.readLine();
        LinkedList<Character> list = new LinkedList<>();
        
        while(a.charAt(0) != '.'){
            boolean check = true;
            int count = 0;
            
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) == '('){
                    list.addFirst('(');
                    count++;
                }
                else if(a.charAt(i) == '['){
                    list.addFirst('[');
                    count++;
                }
                else if(a.charAt(i) == ')'){
                    if(count==0){
                        check = false;
                        break;
                    }
                    count--;
                    if(list.get(0) =='('){
                        list.removeFirst();
                    }
                    else{
                        check = false;
                        break;
                    }
                }
                else if(a.charAt(i) == ']'){
                    if(count==0){
                        check = false;
                        break;
                    }
                    count--;
                    if(list.get(0) =='['){
                        list.removeFirst();
                    }
                    else{
                        check = false;
                        break;
                    }
                }
                else if(a.charAt(i) == '.'){
                    list.clear();
                    break;
                }
            }
            
            if(count != 0){
                check = false;
            }
            if(check){
                bw.write("yes\n"); 
            }
            else{
                bw.write("no\n");
            }
            a = br.readLine();
        }
        bw.flush();
        bw.close();
    }    
}
