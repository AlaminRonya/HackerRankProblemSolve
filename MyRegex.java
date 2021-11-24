import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile("[.]");

        Pattern p1 = Pattern.compile("[0-9]+");
//        Pattern p = Pattern.compile("^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$");
        int t= 12;
        while (t>0){
            String s = bufferedReader.readLine().trim();
            int count=0;
            Matcher m1 = p.matcher(s);
            while (m1.find()) {
                count++;
            }
            String[] str = p.split(s);
            if (str.length == 4 && count==3){
                int c = 0;
                for (String s1: str){
                    try {
                        Matcher m = p1.matcher(s1);
                        int number = Integer.parseInt(s1);
                        if (m.find() && m.group().equals(s1) && number < 256){
                            continue;
                        }else {
                            c = 1;
                            break;
                        }
                    }catch (Exception e){
                        System.out.println(false);
                    }
                }
                if (c !=0){
                    System.out.println(false);
                }else {
                    System.out.println(true);
                }
            }else{
                System.out.println(false);
            }
            t--;
        }



    }
}
