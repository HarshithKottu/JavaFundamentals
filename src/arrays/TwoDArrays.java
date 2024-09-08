package arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        //int[][] twoD = new int[2][2];
        int[][] twoD = {{1,2}, {3,4}};
        for (int[] oneD : twoD) {
            for (int value : oneD) {
                System.out.println(value + " ");
            }
            System.out.println();
        }
    }
}
