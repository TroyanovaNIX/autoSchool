package Module4;

import org.apache.log4j.*;

public class SimpleClass {

    private static final Logger log = Logger.getLogger(SimpleClass.class);

    public void method1() {
        System.out.println("Method 1 is executing");
        log.info("Method 1 is executing");
        method2();
    }

    private void method2() {
        System.out.println("Method 2 is executing");
        log.error("Method 2 is executing");
    }
}
