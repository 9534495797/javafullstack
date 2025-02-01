import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        Stream<Integer>generate=Stream.generate(()->1).limit(100);
        System.out.println(generate.count());
        List<Integer>collect=Stream.iterate(1,x->x+2)
        .limit(100).collect(Collectors.toList());
        System.out.println(collect);

    }
}
