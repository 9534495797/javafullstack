import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<num;i++){
            int c=a+b;
            a=b;
            b=c;
        
        System.out.print(c);
    System.out.print(" ");}
    }
}
