
package AbstractClass;

public class Run {
    public static void main(String[] args) {
        Circle s1 = new Circle(10.5);
        s1.welcome();
        System.out.println("Circle circumstance: " + s1.circumstance());
        System.out.println("Circle area: " + s1.area());
        
        Rectangle s2 = new Rectangle(100, 50);
        s2.welcome();
        System.out.println("Rectangle circumstance: " + s2.circumstance());
        System.out.println("Rectangle area: " + s2.area());
        
        Shape s3 = new Shape() { // Anonymous class
            double side = 10;
            
            @Override
            public double circumstance() {
                return 4*side;
            }

            @Override
            public double area() {
                return side*side;
            }
        };
        
        System.out.println("Square circumstance: "+ s3.circumstance());
        System.out.println("Square area: "+ s3.area());
    }
}
