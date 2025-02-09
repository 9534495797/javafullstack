import java.util.function.Predicate;

public class LambdaPractice {
    public static void main(String[] args) {
        Predicate<String>isWordStartsWithA=x->x.toLowerCase().startsWith("a");
        Predicate<String>isWordEndssWithT=x->x.toLowerCase().endsWith("t");
        Predicate<String>and=isWordStartsWithA.and(isWordEndssWithT);
        System.out.println(and.test("Ankit"));
    }
}
