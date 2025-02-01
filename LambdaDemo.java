interface Car{
    public void show();
}
public class LambdaDemo {
    public static void main(String[] args) {
        
    //     Car car=new Car(){
    //         @Override
    //         public void show(){
    //             System.out.println("this is a car");
    //         }
    //     };
    //     car.show();
    Car  car=()->{
        System.out.println("this is a car");
    };
    car.show();
     }
    

}
