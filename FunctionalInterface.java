import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {
        Function<Integer,Integer>doubleit=x->2*x;
        Function<Integer,Integer>tripleit=x->3*x;
        System.out.println(doubleit.andThen(tripleit).apply(20));
        System.out.println(doubleit.compose(tripleit).apply(20));
        System.out.println(doubleit.apply(2));
    }
}
