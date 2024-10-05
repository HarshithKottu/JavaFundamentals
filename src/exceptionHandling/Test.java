package exceptionHandling;

public class Test {
    public static void main(String[] args) {
        String username = null;
        String password = "Harsha@1999";
        boolean isValid = false;
        try {
            isValid = isValid(username, password);
        } catch (NullPointerException e) {
            System.out.println("either username or password is null");
        }
        if (isValid) {
            System.out.println("Valid User");
        } else {
            System.out.println("Invalid User");
        }
    }

    private static boolean isValid(String username, String password) throws NullPointerException {
        // The above "throws" keyword indicates that this method get Null Pointer exception and this method has no method to handle in it and so It is reporting at the method start.
        // If the method throw Null pointer Exception then it will report to the calling method.
        boolean isValid = false;
        if (username.equalsIgnoreCase("Harshith") && password.equals("Harsha@1999")) {
            isValid = true;
        }
        return isValid;
    }
}
