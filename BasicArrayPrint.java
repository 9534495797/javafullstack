import java.util.stream.Stream;
import java.util.Arrays;
public class BasicArrayPrint {
    public static void main(String[] args) {
        String[]array={"Apple","Banana","cherry","Date"};
        Stream<String>stream=Arrays.stream(array);
        stream.forEach(element->System.out.println(element));
    }
}
