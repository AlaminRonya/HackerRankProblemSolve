import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithms {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine().trim());
        int b = Integer.parseInt(bufferedReader.readLine().trim());
        Add add = new Add(a,b);
        System.out.println(add.add());
    }
}

class Add{
    private int a;
    private int b;

    public Add(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add(){
        return a+b;
    }
}
