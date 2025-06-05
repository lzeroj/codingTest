import java.io.*;
import java.util.*;
public class Main{ 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0;
        double[] arr = new double[n];
        double total = 0;
        for(int i=0; i<n; i++){
            arr[i] = Double.parseDouble(st.nextToken());
            if(arr[i] > max){
                max = arr[i];
            }            
            total += arr[i];
        }
        System.out.println(total/max*100/n);
    }
}