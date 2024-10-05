package java8Features;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.greet();
        greeting.greet("Namasthe");


        // Anonymous inner class
        // Object to the inner class
        Greet greet = new Greet() {
            @Override
            public void greet() {
                System.out.println("greet");
            }

            @Override
            public void greet(String msg) {
                System.out.println(msg);
            }
        };
        greet.greet();
        greet.greet("Hi Hello");

        // Threading
        // Runnable -> run
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        // lambda expression
        // is the implementation of functional interfaces (instance of the functional interface)
        // Syntax
        /*
        () -> {logic}
        */
        /*Hello hello = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Hii Buddy");
            }
        };*/
        Hello hello = () -> System.out.println("Hii Buddy");
        hello.sayHello();

        Wish wish = (wishMsg) -> System.out.println(wishMsg);
        wish.sayHello("congratulations");
    }
}
