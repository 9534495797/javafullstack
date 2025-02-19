import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WithoutComparatorDemo {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(3);
        num.add(7);
        num.add(9);
        
        // Sorting the list in ascending order
        Collections.sort(num);
        
        // Printing the sorted list
        System.out.println(num);
    }
}
