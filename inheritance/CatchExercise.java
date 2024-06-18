package inheritance;

public class CatchExercise {
 public static void main(String[] args) {
        try {
            // Initialize an array with incorrect size to trigger ArrayIndexOutOfBoundsException
            int[] a = new int[5];
            
            // Attempt to access an element beyond the array's bounds
            a[5] = 30 / 5;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}
