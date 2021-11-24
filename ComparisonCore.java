import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ComparisonCore {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bufferedReader.readLine().trim();
        String s2 = bufferedReader.readLine().trim();
        Pattern p = Pattern.compile("\\s+");
        String[] s12 = p.split(s1);
        String[] s22 = p.split(s2);
        Score score = new Score(s12,s22);
        score.getScore();

    }
}
class Score{
    private int aliceScore=0;
    private int bobsScore=0;
    private DynamicArray dynamicArray1;
    private DynamicArray dynamicArray2;
    public Score(String[] s1, String[] s2){
        if (s1.length==s2.length){
            DynamicArray d1 = new DynamicArray();
            DynamicArray d2 = new DynamicArray();
            for (int i=0; i<s1.length; i++){
                int a = Integer.parseInt(s1[i]);
                int b = Integer.parseInt(s2[i]);
                d1.addItem(a);
                d2.addItem(b);
            }
            dynamicArray1 = d1;
            dynamicArray2 = d2;
        }

    }
    public void show(){
        dynamicArray1.print();
        dynamicArray2.print();
    }
    public void getScore(){

        for (int i=0; i<dynamicArray1.size(); i++){
            int i1 = dynamicArray1.getItem(i);
            int i2 = dynamicArray2.getItem(i);
            if (dynamicArray1.getItem(i)>dynamicArray2.getItem(i)){
                aliceScore++;
            }else if (dynamicArray1.getItem(i)<dynamicArray2.getItem(i)){
                bobsScore++;
            }
        }
        System.out.println(this.aliceScore +" "+this.bobsScore);
    }

}
class DynamicArray{
    private int[] theArray;
    private int numItems=0;
    public DynamicArray(){
        theArray = new int[1];
        numItems = 0;
    }
    public void addItem(int item){
        if (numItems == theArray.length){
            growArray();
        }
        theArray[numItems++] = item;
    }

    private void growArray() {
        int[] tempArray = new int[theArray.length+10];
        for (int i=0; i<numItems; i++){
            tempArray[i] = theArray[i];
        }
        theArray = tempArray;
    }

    public void print(){
        for (int i = 0; i<numItems; i++){
            System.out.print(theArray[i]+" ");
        }
        System.out.println();
    }
    public int size(){
        return numItems;
    }
    public int getItem(int index){
        return theArray[index];
    }
    public void getTwoArray(DynamicArray d1, DynamicArray d2){
        for (int i=0; i<size(); i++){
            int i1 = d1.getItem(i);
//            int i2 = d2.theArray[i];
            System.out.println(i1 +" ");
        }
        System.out.println("getTowArray");

    }
}