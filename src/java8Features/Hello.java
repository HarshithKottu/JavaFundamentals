package java8Features;

// Functional Interfaces are used for anonymous inner classes.(only for SAM)
@FunctionalInterface
public interface Hello {
    // Single Abstract Method SAM : if there is only one implementation for this method then it is called so..
    void sayHello();
}
