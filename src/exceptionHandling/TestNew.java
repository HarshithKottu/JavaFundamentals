package exceptionHandling;

public class TestNew {
    public static void main(String[] args) {
        String username = null;
        String password = "Harsha@1999";
        boolean isValid = false;
        try {
            isValid(username, password);
            System.out.println("Valid Creds");
        } catch (NullPointerException e) {
            System.out.println("either username or password is null");
        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean isValid(String username, String password) throws NullPointerException, InvalidUserException {
        // The above "throws" keyword indicates that this method get Null Pointer exception and this method has no method to handle in it and so It is reporting at the method start.
        // If the method throw Null pointer Exception then it will report to the calling method.
        boolean isValid = false;
        if (username.equalsIgnoreCase("Harshith") && password.equals("Harsha@1999")) {
            isValid = true;
        } else
            // Custom exceptions
            throw new InvalidUserException("wrong username or password");
        return isValid;
    }
}
