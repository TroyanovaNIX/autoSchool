package Module2;

import java.util.Random;
import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        Basic main1 = new Basic();////
        Scanner scn=new Scanner(System.in);

        System.out.println("Subtask1 - minFromTwo. Input 2 numbers ");
        double a=scn.nextDouble();
        double b=scn.nextDouble();
        System.out.println(main1.minFromTwo(a,b));

        System.out.println("Subtask2 - maxFromFour. Input 4 integers");
        int a2=scn.nextInt();
        int b2=scn.nextInt();
        int c2=scn.nextInt();
        int d2=scn.nextInt();
        System.out.println(main1.maxFromFour(a2,b2,c2,d2));

        System.out.println("Subtask3 - threeInDescOrder. Input 3 integers");
        int a3=scn.nextInt();
        int b3=scn.nextInt();
        int c3=scn.nextInt();
        main1.threeInDescOrder(a3, b3, c3);

        System.out.println("Subtask4 - compareNames. Input 2 names");
        String name1=scn.next();
        String name2=scn.next();
        System.out.println(name1+"    "+name2);
        main1.compareNames(name1, name2);

        System.out.println("Subtask5 - checkAge. Input name and age");
        String name=scn.next();
        int age=scn.nextInt();
        main1.checkAge(name, age);

        System.out.println("Subtask6 - checkAge2. Input name and age");
        name=scn.next();
        age=scn.nextInt();
        main1.checkAge2(name, age);

        System.out.println("Subtask7 - Guess the num.");
        main1.guessNumber();

        System.out.println("Subtask8 - printNumbersAscOrderWhile");
        main1.printNumbersAscOrderWhile(10);

        System.out.println("Subtask9 - printNumbersDescOrderWhile");
        main1.printNumbersDescOrderWhile(10);

        System.out.println("Subtask10 - printStringSeveralTimes. Input string and repeat times");
        String string=scn.next();
        int N=scn.nextInt();
        main1.printStringSeveralTimes(string, N);

        System.out.println("Subtask11 - printSquare.");
        main1.printSquare(10);

        System.out.println("Subtask12 - printMultipleTable.");
        main1.printMultipleTable(10);

        System.out.println("Subtask13 - printEvenNumbers.");
        main1.printEvenNumbers(100);

        System.out.println("Subtask14 - printRectangle. Input height and width");
        int m=scn.nextInt();
        int n=scn.nextInt();
        main1.printRectangle(m,n);

        System.out.println("Subtask15 - printTrialgle.");
        main1.printTrialgle(10);

        System.out.println("Subtask16 - printLines.");
        main1.printLines(10);

        System.out.println("Subtask17 - printLove. Input name");
        String loverName=scn.next();
        main1.printLove(loverName,10);

        System.out.println("Subtask18 - Boom.");
        main1.boom(30);

    }

    public double minFromTwo(double a, double b) {
        return (a < b ? a : b);
    }

    public int maxFromFour(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        return max;
    }

    public void threeInDescOrder(int a, int b, int c) {
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        if (c > b) {
            System.out.println(c + " " + b + " " + a);
        } else {
            if (c > a) {
                System.out.println(b + " " + c + " " + a);
            } else {
                System.out.println(b + " " + a + " " + c);
            }
        }
    }

    public void compareNames(String name1, String name2) {
        if (name1.equals(name2)) {
            System.out.println("Names are equal");
        }
        else {
            if (name1.length() == name2.length()) {
                System.out.println("Names are not equals but have the same length");
            }
        }
    }

    public void checkAge(String name, int age) {
        if (age < 18) System.out.println("Подрасти еще");
    }

    public void checkAge2(String name, int age) {
        if (age > 20) System.out.println("И 18-ти достаточно");
    }

    public void guessNumber() {
        Random random = new Random();
        int secret;
        // Генерируем число от 0 до 20
        secret = random.nextInt(20 + 1);
        Scanner scn = new Scanner(System.in);
        int num;
        boolean flag = false;
        for (int i = 0; i < 7; i++) {
            System.out.println("please, input the number");
            num = scn.nextInt();
            if (num > secret) {
                System.out.println("Много");
            } else {
                if (num < secret) {
                    System.out.println("Мало");
                } else {
                    System.out.println("Угадал :)");
                    flag = true;
                    break;
                }
            }

        }
        if (!flag)
            System.out.println("Не угадал :(");
    }

    public void printNumbersAscOrderWhile(int n) {
        int i = 1;
        System.out.println();
        while (i < n + 1) System.out.print(i++ + " ");
        System.out.println();

    }

    public void printNumbersDescOrderWhile(int n) {
        int i = n;
        System.out.println();
        while (i > 0) System.out.print(i-- + " ");
        System.out.println();

    }

    public void printStringSeveralTimes(String string, int N) {
        while (N-- > 0) System.out.println(string);
    }

    public void printSquare(int n) {
        int i = 0;
        while (i++ < n) {
            int j = 0;
            while (j++ < n) {
                System.out.print("S");
            }
            System.out.println();
        }
    }

    public void printMultipleTable(int n) {
        int i = 0;
        while (i++ < n) {
            int j = 0;
            while (j++ < n) {
                System.out.print(i * j + " \t");
            }
            System.out.println();
        }
    }

    public void printEvenNumbers(int n) {
        for (int i = 1; i <= n / 2; i++) {
            System.out.print(i * 2 + " ");
        }
        System.out.println();

    }

    public void printRectangle(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("8");
            System.out.println();
        }
    }

    public void printTrialgle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print("8");
            System.out.println();
        }
    }

    public void printLines(int length) {
        for (int j = 0; j < length; j++)
            System.out.print("8 ");
        System.out.println();
        for (int j = 0; j < length; j++)
            System.out.println("8");
    }

    public void printLove(String name, int count) {
        for (int i = 0; i < count; i++)
            System.out.println(name + " любит меня");
    }

    public void boom(int time) {
        for (int i = 30; i > -1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("Something happened(((");
            }
        }
        System.out.println("Бум!");
    }
}
