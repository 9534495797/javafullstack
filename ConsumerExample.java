import java.util.function.Consumer;

// public class ConsumerExample {
//     public static void main(String[] args) {
//         Consumer<String>printmessage=message->System.out.println("mesage: "+message);
//         printmessage.accept("hello world");
//     }
// }

//ex1

// public class ConsumerExample {
//     public static void main(String[] args) {
//         Consumer<Integer>printsquare=num->System.out.println("mesage: "+(num*num));
//         printsquare.accept(4);
//     }
// }

//ex2
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String>prefixname=message->System.out.println("mesage: "+"HII"+" "+message);
        prefixname.accept("Shalli");
    }
}