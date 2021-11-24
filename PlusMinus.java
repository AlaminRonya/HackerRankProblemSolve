import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Pattern  p = Pattern.compile("\\s+");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String s = bufferedReader.readLine().trim();
        String[] str = p.split(s);
        int plus = 0, minus = 0, zero = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(str[i]);
            if (number == 0){
                zero++;
            }else  if (number < 0){
                minus++;
            }else {
                plus++;
            }
        }
        System.out.println(String.format("%.6f",(double)plus/n));
        System.out.println(String.format("%.6f",(double)minus/n));
        System.out.println(String.format("%.6f",(double)zero/n));
    }
}
