import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HackerRankPatternChecking {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        while(n!=0){
            String pattern = bufferedReader.readLine().trim();

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(PatternSyntaxException e) {
                System.out.println("Invalid");
            }

            n--;
        }
    }
}
