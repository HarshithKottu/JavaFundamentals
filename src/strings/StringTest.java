package strings;

public class StringTest {
    public static void main(String[] args) {
        String str = new String();
        System.out.println(str);
        // Creating an String Object
        String str1 = new String("HarSHith");
        String str2 = new String("HarSHith");
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.charAt(3));
        // Creating literals
        String str3 = "HarSHith";
        String str4 = "HarSHith";
        // str1 and str2 points to different objects even though they contains same values
        System.out.println(str1 == str2);
        // str3, str 4 points to same value and they are equal
        System.out.println(str3 == str4);
        // String is immutable (cant change until if we hard code/ overwrite)
        // CSV = comma seperated values
        String employee = "111,Customer1,Customer1@gmail.com,4786893467,345";
        String[] values = employee.split(",");
        for (String value:values){
            System.out.println(value);
        }
    }
}
