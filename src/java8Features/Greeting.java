package java8Features;

// This class implements Greet interface
public class Greeting implements Greet {
    /**
     *
     */
    @Override
    public void greet() {
        System.out.println("Hi hello");
    }

    /**
     * @param msg
     */
    @Override
    public void greet(String msg) {
        System.out.println(msg);
    }
}
