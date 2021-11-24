import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateStringRemove {

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        String regex = "(\\b\\w+\\b)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        int n = Integer.parseInt(in.nextLine().trim());
        while (n>0){
            String s = in.nextLine().trim();
            Matcher m = p.matcher(s);
            while (m.find()) {
                s = s.replaceAll(m.group(), m.group(1));
            }
            System.out.println(s);
            n--;
        }
        in.close();

    }
}
