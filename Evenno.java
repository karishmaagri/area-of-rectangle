package collection;
import java.util.ArrayList;
import java.util.List;



public class Evenno {
 public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(7);
        numbers.add(4);
        
        int totalEven = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                totalEven += num;
            }
        }
        
        System.out.println("Total of all even numbers: " + totalEven);
    }
}
