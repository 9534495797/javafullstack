import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
public class MapOps {
 


    public static void main(String[] args) {
        List<String>names=Arrays.asList("alise","bob","charlie");
   List<String>uppercaseNames=names.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
   System.out.println(uppercaseNames);
    }
}


