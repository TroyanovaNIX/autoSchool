package Module4;
import java.lang.InterruptedException.*;

public class MainExceptions {
    public static void main(String[] args) {

    System.out.println("Hello");
    try

    {
        Thread.sleep(3000);
    }
	catch(
    Exception ex)

    {

        System.out.println(ex.getMessage());
    }
    System.out.println("world!!!");

    A objA=new A();
    objA.methodA();
    objA.methodB();
}
}

