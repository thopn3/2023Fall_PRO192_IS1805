
package AbstractClass;


public class Circle extends Shape implements IShape{
    double r;
    
    public Circle(double rr){
        r = rr;
    }
    
    @Override
    public double circumstance() {
        return 2*IShape.PI*r;
    }

    @Override
    public double area() {
        return IShape.PI*r*r;
    }

    @Override
    public void welcome() {
        System.out.println("Welcome working Circle");
    }
    
}
