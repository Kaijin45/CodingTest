import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        String a = "";
        boolean check = true;
        
        for(int i = 1; i<=num; i++){
            if(i/10 == 0){
                count++;
            }
            else if(i/100 == 0){
                count++;
            }
            else{
                a = Integer.toString(i);
                check = true;
                for(int j = 0; j<a.length()-2; j++){
                    if(a.charAt(j+1) - a.charAt(j) != a.charAt(j+2) - a.charAt(j+1)){
                        check = false;
                        break;
                    }
                }
                if(check){
                    count++;
                }
            }
        }
        
        bw.write(count+"\n");
        bw.flush();
        bw.close();
    }
}