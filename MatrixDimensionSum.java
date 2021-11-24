import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class MatrixDimensionSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile("\\s+");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[][] arr = new int[n][n];
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = bufferedReader.readLine().trim();
        }
        for (int i = 0; i < n; i++) {
            String[] st = p.split(str[i]);
            for (int j = 0; j < n; j++) {
                arr[i][j]=Integer.parseInt(st[j]);
            }
        }
        int s1 = 0, s2 = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            s1 +=arr[i][k];
            s2 += arr[i][n-1-k];
            k++;
        }
        int ss = s1 -s2;
        System.out.println(Math.abs(ss));
    }
}
