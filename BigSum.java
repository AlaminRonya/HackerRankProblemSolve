import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class BigSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile("\\s+");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String str = bufferedReader.readLine().trim();
        String[] arr = p.split(str);
        long sum  = 0;
        for (String s : arr){
            long value = Long.parseLong(s);
            sum += value;
        }
        System.out.println(sum);
    }
}
