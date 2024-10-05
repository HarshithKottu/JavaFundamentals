package exceptionHandling;

import java.util.Scanner;

public class ExceptionsTest {
    public static void main(String[] args) {
        //int test = 100/0; // this gives an arithmetic exception and stop the program here without executing further.
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int[] ids = {1, 2, 3};
        // int res = numero1/numero2; // instead of this we use try-catch block
        try {
            int res = numero1 / numero2;
            System.out.println("The result is: " + res);
            // This is the case where if try is giving two exceptions
            System.out.println(ids[4]);
        } catch (ArithmeticException e) {
            System.out.println("number should be Zero");
            System.out.println("Please try again");
            // ... you can call a new method from here to give new inputs.
        } catch (IndexOutOfBoundsException e1) {
            System.out.println("Exception: " + e1);
            e1.printStackTrace();
            System.out.println(e1.getMessage());
            //
        }
        System.out.println("Hellooooo");
    }
}
