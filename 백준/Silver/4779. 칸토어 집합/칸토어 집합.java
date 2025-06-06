import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) !=null ){
            int n = Integer.parseInt(line);
            int length = (int) Math.pow(3,n);
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<length; i++){
                sb.append("-");
            }
            cantor(sb, 0, length);
            System.out.println(sb.toString());
        }
    }
    static void cantor(StringBuilder sb, int start, int len){
        if(len < 3) return;

        int third = len / 3;

        for(int i=start+third; i<start + 2 * third; i++){
            sb.setCharAt(i, ' ');
        }

        cantor(sb, start, third);
        cantor(sb, start + 2*third, third);
    }

}
