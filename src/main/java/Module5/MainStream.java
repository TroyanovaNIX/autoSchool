package Module5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainStream {
    public  List<String> initializeListOfRandomStrings(int size){
        List<String> strings=new ArrayList<String>();

        Random rnd=new Random(System.currentTimeMillis());
        for (int i=0;i<size-5;i++){
            int length=rnd.nextInt(20)+1;
            String s="";
            for (int j=0;j<length;j++)
            {
                char leter=((char)(rnd.nextInt(52)+65));
                s+=leter;
            }
            strings.add(s);
        }
        for(int i=0;i<5;i++){
            strings.add("");
        }
        return strings;
    }
    public List<String> createList(int count){
        List<String> list=new ArrayList<String>();

        for(int i=0; i<count;i++)
            list.add("arg0"+i);

        for (int i=0; i<3; i++)
            list.add("");
        return list;
    }

    public List<Integer> listOfLengths(List<String> sourceList){
        List<Integer> lengthList;
        lengthList=sourceList.stream()
                .mapToInt(str->str.length())
                .boxed()
                .collect(Collectors.toList());
        return lengthList;
    }

    public <T> void printList(List<T> list){
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }

    public List<String> listOfFilledWithout_d(List<String> sourceList){
        List<String> lengthList;
        lengthList=sourceList.stream().filter(str->str!=""&&!str.contains("d")).collect(Collectors.toList());
        return lengthList;

    }
    public List<String> orderedList(List<String> sourceList){
        List<String> lengthList;
        lengthList=sourceList.stream().sorted().collect(Collectors.toList());
        return lengthList;

    }
    public static void main(String[] args){
        MainStream mainStream=new MainStream();
        List<String> strings=mainStream.initializeListOfRandomStrings(60);


        //List<String> listObj=mainStream.createList(8);
        mainStream.printList(strings);
        System.out.println("-----Subtask1. Print list of lengths");
        mainStream.printList(mainStream.listOfLengths(strings));
        System.out.println("-----Subtask2. Print filtered list without empty strings and strings contained 'd' ");
        mainStream.printList(mainStream.listOfFilledWithout_d(strings));
        System.out.println("-----Subtask3. Print sorted list");
        mainStream.printList(mainStream.orderedList(strings));


    }
}
