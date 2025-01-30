interface Cal{
    public void show(int num1, int num2);
}
public class LambdaCal {
    public static void main(String[] args) {
        
  
    Cal  cal=(num1,num2)->{
        System.out.println("this is a cal "+(num1+num2));
    };
    cal.show(4,5);
     }
    

}
