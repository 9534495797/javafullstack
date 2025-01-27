interface Anomnymous{
    void sayhello();
}
public class Main{
    public static void main(String[]args){
Anomnymous ab=new Anomnymous() {
    @Override
    public void sayhello(){
        System.out.println("hello ankit");
    }
};
ab.sayhello();
    }
}