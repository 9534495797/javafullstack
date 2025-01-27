interface Shape {
    double area();
}

public class Circle {
    public static void main(String[] args) {
        Shape ab = new Shape() {
            int r = 7;

            @Override
            public double area() {
                return Math.PI * r * r;
            }
        };

        System.out.println("Area of the circle: " + ab.area());
    }
}
