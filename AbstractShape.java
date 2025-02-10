abstract class Shape {
    abstract void draw();
}
public class AbstractShape{
public static void main(String[] args) {
    Shape shape=new Shape() {
        
        @Override
        void draw()
        {
            System.out.println("drawing a shape");
        }
    };
    shape.draw();
}
}