import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        for(int i = 0; i < loop; i++){
            long number = Long.parseLong(br.readLine());
            for(int j = 2; j <= 1000000; j++){
                if(number%j == 0){
                    System.out.println("NO");
                    break;
                }
                if(j==1000000){
                    System.out.println("YES");
                }
            }
        }
    }
}