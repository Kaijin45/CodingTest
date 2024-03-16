import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 1; i<=num; i++){
            st = new StringTokenizer(br.readLine(), " ");
        
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            
            if(x1 == x2 && y1 == y2){
                if(r1==r2){
                    bw.write("-1\n");
                }
                else{
                    bw.write("0\n");
                }
            }
            else{
                int w = x2 - x1;
                int h = y2 - y1;
                
                w = w*w;
                h = h*h;
                double distance = Math.sqrt(w + h);
                
                if(r1>r2){
                    int temp = r1;
                    r1 =r2;
                    r2 = temp;
                }
                
                
                if((distance + r1) < r2){
                    bw.write("0\n");
                }
                else if((distance + r1) == r2){
                    bw.write("1\n");
                }
                else{
                    if(distance > r1){
                        if((distance - r1) > r2){
                            bw.write("0\n");
                        }
                        else if((distance - r1) == r2){
                            bw.write("1\n");
                        }
                        else{
                            bw.write("2\n");
                        }
                    }
                    else if(distance == r1){
                        bw.write("2\n");
                    }
                    else{
                        if((r1 - distance) > r2){
                            bw.write("0\n");
                        }
                        else if((r1 - distance) == r2){
                            bw.write("1\n");
                        }
                        else{
                            bw.write("2\n");
                        }
                    }
                    
                }
                
            }
            
        }
        
        bw.flush();
        bw.close();
    }    
}
