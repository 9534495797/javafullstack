import java.util.ArrayList;
public class ListIteration{
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Ankit");
        names.add("sonu");
        names.add("satya");

        for(String name:names){
            System.out.println(name);
        }
for(int i=0;i<names.size();i++){
    System.out.println("name at index"+i+": "+names.get(i));
}
    }
}