interface Runnable{
  void task();
}
public class RunAble {
    public static void main(String[]args){

 
    Runnable ta=new Runnable() {
        @Override
        public void task(){
            System.out.println("i can run");
        }
    };
ta.task();
}
}
