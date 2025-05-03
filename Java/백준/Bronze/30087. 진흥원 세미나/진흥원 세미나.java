import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<num; i++){
            switch(br.readLine()){
                case "Algorithm":
                    sb.append("204").append('\n');
                    break;
                case "DataAnalysis":
                    sb.append("207").append('\n');
                    break;
                case "ArtificialIntelligence":
                    sb.append("302").append('\n');
                    break;
                case "CyberSecurity":
                    sb.append("B101").append('\n');
                    break;
                case "Network":
                    sb.append("303").append('\n');
                    break;
                case "Startup":
                    sb.append("501").append('\n');
                    break;
                case "TestStrategy":
                    sb.append("105").append('\n');
                    break;
            }
        }
        
        System.out.println(sb);
       }
}
