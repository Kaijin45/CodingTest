import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        if (x<0){
            if(y<0){
                System.out.print(3);
            }
            else{
                System.out.print(2);
            }
        }
        else{
            if(y>0){
                System.out.print(1);
        }
        else{
            System.out.print(4);
        }
    }
}
}
