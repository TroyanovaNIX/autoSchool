package Module2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Massiv {

    public int [] initializeArray(int count) throws IOException {
        int [] massiv=new int[count];
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int i=0;
        while((i<count)){
            massiv[i]=Integer.parseInt(bis.readLine());
            i++;
        }
        return massiv;
    }
    public String [] initializeArrayStrings(int size, int count) throws IOException {
        String [] massiv=new String[size];

        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        if (count>size) {throw new ArrayIndexOutOfBoundsException();}
        else {
            int i = 0;
            while ((i < count)) {
                massiv[i] = bis.readLine();
                i++;
            }
        }
        return massiv;
    }
    public void printInReverse(String[] arr){
        for(int i=arr.length-1; i>=0; i--)
            System.out.println(arr[i]);
    }
    public  int maxElement(int [] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
    public int [] createArrayOfLengths(String[] source){
        int [] arrOfLengths=new int[source.length];
        int i=0;
        for(String item : source){
            arrOfLengths[i]=item.length();
            i++;
        }
        return arrOfLengths;
    }

    public  void  printArray(int [] source){
        for(int item : source)
            System.out.println(item);
    }
    public int[] reverseArray(int [] source){
        for(int i=0; i<source.length/2;i++){
            int t=source[i];
            source[i]=source[source.length-i-1];
            source[source.length-i-1]=t;
        }
        return source;
    }

    public int[] getPartOfArray(int[] source, int begin, int end){
        return Arrays.copyOfRange(source, begin, end);
    }

    public  static void main(String[] args) {
        Massiv massiv=new Massiv();

        System.out.println("Subtask1. Max element");
        try {
            int[] masiv1 = massiv.initializeArray(20);
            massiv.printArray(masiv1);
            System.out.println("maximum element is "+massiv.maxElement(masiv1));
        }
        catch (IOException e){System.out.println("Unsuccessful enter");}

        System.out.println("Subtask2. Print string array");
        try {
            String[] masiv2 = massiv.initializeArrayStrings(10,8);
            massiv.printInReverse(masiv2);
        }
        catch (IOException e){System.out.println("Unsuccessful enter");}

        System.out.println("Subtask3. print array of string`s lengthes");
        try {
            String[] masiv3=massiv.initializeArrayStrings(10,10);
            int[] masivOfLengthes = massiv.createArrayOfLengths(masiv3);
            massiv.printArray(masivOfLengthes);
        }
        catch (IOException e){System.out.println("Unsuccessful enter");}

        System.out.println("Subtask4. Array revers");
        try {
            int[] masiv4 = massiv.initializeArray(10);
            massiv.reverseArray(masiv4);
            massiv.printArray(masiv4);
        }
        catch (IOException e){System.out.println("Unsuccessful enter");}

        System.out.println("Subtask5. Print second half of array");
        try {
            int[] masiv5 = massiv.initializeArray(20);
//            int[] smallArray1=massiv.getPartOfArray(masiv5,0,10);
            int[] smallArray2=massiv.getPartOfArray(masiv5,10,masiv5.length);
            massiv.printArray(smallArray2);
        }
        catch (IOException e){System.out.println("Unsuccessful enter");}

    }




}
