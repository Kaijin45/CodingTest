import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        
        double A = 0;
        double B = 0;
        
        for(int i = 0; i<20; i++){
            st = new StringTokenizer(br.readLine(), " ");
        
            String name = st.nextToken();
            Double point = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            double gradeN = 0.0;
            
            if(grade.equals("P")){
                continue;
            }
            else{
                switch(grade){
                    case "A+":
                        gradeN = 4.5;
                        break;
                    case "A0":
                        gradeN = 4.0;
                        break;
                    case "B+":
                        gradeN = 3.5;
                        break;
                    case "B0":
                        gradeN = 3.0;
                        break;
                    case "C+":
                        gradeN = 2.5;
                        break;
                    case "C0":
                        gradeN = 2.0;
                        break;
                    case "D+":
                        gradeN = 1.5;
                        break;
                    case "D0":
                        gradeN = 1.0;
                        break;
                    case "F":
                        gradeN = 0.0;
                        break;
                }
                A += point;
                B += point*gradeN;
                
            }
            
        }
        
        System.out.printf("%.6f", B/A);
       
    }    
}
