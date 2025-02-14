import java.util.ArrayList;

public class FibonacciArrayList {
    public static void main(String[] args){
        
        ArrayList<Integer> fibonacci = new ArrayList<>();

        
        fibonacci.add(0); 
        fibonacci.add(1); 
        
        for (int i = 2; i < 10; i++) {
            
            int next = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(next);
        }

       
        System.out.println("First 10 Fibonacci numbers: " + fibonacci);
    }
}
