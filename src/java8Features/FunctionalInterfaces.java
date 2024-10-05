package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // Predicate

        // Eve or Odd
        Predicate<Integer> isEvenPredicate = num -> num % 2 == 0;
        System.out.println(isEvenPredicate.test(99));

        //Consumer
        //accept (Object)
        List<String> customerNamesList = Arrays.asList("customer1", "customer2", "customer3");

        /*Consumer<String> printNameConsumer = name -> System.out.println(name);
        customerNamesList.forEach(printNameConsumer);*/
        // Above code can be written as follows using lambda exp
        customerNamesList.forEach(System.out::println); // :: Method Reference

        Function<String, String> upperCaseFunction = name -> {
            name = name.toUpperCase();
            return name;
        };

        customerNamesList.forEach(name -> System.out.println(upperCaseFunction.apply(name)));
    }
}
