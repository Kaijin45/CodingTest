import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        //input 받은 문자열
        char[] arr = br.readLine().toCharArray();
        //알파벳 26자리에 해당하는 위치 가리키는 정수 배열
        int[] checker = new int[26];
        
        //checker 정수 배열에 일단 -1 값을 모두 넣어줌.
        for(int k = 0; k<26; k++){
            checker[k] = -1;
        }
        
        int checker_v;
        
        //arr크기 횟수 만큼 반복
        for(int i = 0; i<arr.length; i++){
            //반복1 : arr 길이만큼
            checker_v = 0;
            
            for(char j = 'a'; j<='z'; j++){
                
                //반복2 : 알파벳 26번만큼
                if(j==arr[i]){
                    if(checker[checker_v]==-1){
                        checker[checker_v]=i;
                    }
                }
                checker_v++;
                //반복2
            }
            //반복1
        }
        for(int ebe = 0; ebe<26; ebe++){
            bw.write(checker[ebe]+" ");
        }
        bw.flush();
        bw.close();
    }    
}
