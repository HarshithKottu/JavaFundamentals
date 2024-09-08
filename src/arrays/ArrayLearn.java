package arrays;

public class ArrayLearn {
    public static void main(String[] args) {
        int[] ids; // reference variable, array is not created here
        ids = new int[5]; // instantiation (creating object)
        System.out.println(ids[0]);
        // array initialization
        ids[0] = 143;
        ids[1] = 123; // similarly we can initialize for all

        // simple way of initialization
        byte[] marks = {99, 75, 39, 70};
        System.out.println(marks.length);

        // accessing elements.
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            //System.out.print(marks[i]);
        }

        // for -each element in array
        // for each id in ids
        for (int id:ids){
            System.out.println(id);
        }


    }
}
