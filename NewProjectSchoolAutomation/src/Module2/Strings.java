package Module2;
import java.util.Scanner;
/*1 Дана строка. Вывести первый, последний и средний (если он есть) символы. Напишите программу, которая выводит часть
   строки до первой встреченной точки, включая точку. Также предусмотрите вывод количества пробелов.
 2 Найти в строке указанную подстроку и заменить ее на новую. Строку, ее подстроку для замены и новую подстроку вводит пользователь.
 3 Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
   Случай, когда самых длинных слов может быть несколько, не обрабатывать.*/
public class Strings {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String source;
        Strings task4 = new Strings();


        System.out.println("Subtask1. Input source string.");
        source = scanner.nextLine();
        System.out.println("Characters: " + task4.characters(source));
        System.out.println("Substring till dot: " + task4.substringTillDot(source));
        System.out.println("Amount of spaces is " + task4.countOfSpaces(source));


        System.out.println("Subtask2. Input source string, old substring, new substring in the separate lines.");
        String oldSubstr, newSubstr;
        source = scanner.nextLine();
        oldSubstr = scanner.nextLine();
        newSubstr = scanner.nextLine();
        System.out.println("String after replacement: " + task4.replaceSubstring(source, oldSubstr, newSubstr));


        System.out.println("Subtask3. Input source string.");
        String source1 = scanner.nextLine();
        source1 = source1.trim();
        System.out.println("The longest word: " + task4.longestWord(source1));


    }

    public String characters(String string) {
        return string.charAt(0) + " " + string.charAt(string.length() - 1) + " "
                + ((string.length() % 2 == 1) ? string.charAt((string.length() - 1) / 2) : "");


    }

    public String substringTillDot(String string) {
        return string.indexOf('.') >= 0 ? string.substring(0, string.indexOf('.')) : "";
    }

    public int countOfSpaces(String source) {
        return source.length() - source.replace(" ", "").length();
    }

    public String replaceSubstring(String source, String oldSubsrt, String newSubstr) {
        return source.replace(oldSubsrt, newSubstr);
    }

    public String longestWord(String source) {
        String string = "";
        if (source.indexOf(" ") > 0) {
            String[] words = source.split(" ");
            int maxLength = 0;
            int countOfLongestWords = 0;
            for (String str : words) {
                if (str.length() > maxLength) {
                    maxLength = str.length();
                    string = str;
                    countOfLongestWords = 1;
                } else if (str.length() == maxLength) {
                    countOfLongestWords++;
                }
            }
            if (countOfLongestWords > 1) {
                return "There are several longest words in the string";
            } else
                return string;
        } else return source;
    }
}



