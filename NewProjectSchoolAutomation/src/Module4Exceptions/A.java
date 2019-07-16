package Module4Exceptions;

public class A {
    public void methodA() {
        try {
            int zero = 5 / 0;
        } catch (Exception e) {
            System.out.println("You shall not fall!");
        }
    }

    public void methodB() {
        try {
            B objB = new B();
            objB.mB();
        } catch (ArithmeticException e) {
            System.out.println("You shall not fall!");
        }
    }
}
