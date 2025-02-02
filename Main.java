// interface Anomnymous{
//     void sayhello();
// }
// public class Main{
//     public static void main(String[]args){
// Anomnymous ab=new Anomnymous() {
//     @Override
//     public void sayhello(){
//         System.out.println("hello ankit");
//     }
// };
// ab.sayhello();
//     }
// }

import java.util.Arrays;
import java.util.List;
public class Main{
    public static void main(String[]args){
List<Integer>numbers=Arrays.asList(1,2,3,4,5);
int count=0;
for(int i:numbers){
    if(i%2==0){
        count++;
    }
}
System.out.println(count);
}
}