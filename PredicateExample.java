import java.util.function.Predicate;

// public class PredicateExample {
//     public static void main(String[] args) {
//         Predicate<Integer>isEven=number->number%2==0;
//         System.out.println(isEven.test(4));
//         System.out.println(isEven.test(5));
//     }
// }

//ex1
// public class PredicateExample {
//     public static void main(String[] args) {
//         Predicate<String>isStart=word->word.charAt(0)=='A';
//         System.out.println(isStart.test("mnkit"));
//         System.out.println(isStart.test("vivek"));
//     }
// }

// ex2
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer>isGreat=number->number>100;
        System.out.println(isGreat.test(400));
        System.out.println(isGreat.test(5));
    }
}