import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class ArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile("\\s+");

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] arr = new int[n];
        String strNumber = bufferedReader.readLine().trim();
        String[] split = p.split(strNumber);
        int k = 0;
        for (String s: split){
            arr[k] = Integer.parseInt(s);
            k++;
        }

//        for (int i=0; i<n; i++){
//            arr[i] = Integer.parseInt(bufferedReader.readLine().trim());
//        }
        SumOfArray sumOfArray = new SumOfArray(arr);
        System.out.println(sumOfArray.getSum());
    }
}
class SumOfArray{
    private int sum;

    public SumOfArray(int[] sum) {
        this.sum = Arrays.stream(sum).sum();
    }
    public int getSum(){
        return sum;
    }
}