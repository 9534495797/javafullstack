import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (int number : numbers) {
            if (uniqueNumbers.add(number)) {
                resultList.add(number);
            }
        }

        System.out.println("Original List: " + numbers);
        System.out.println("List after removing duplicates: " + resultList);
    }
}
