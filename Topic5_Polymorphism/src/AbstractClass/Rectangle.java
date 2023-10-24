
package AbstractClass;

public class Rectangle extends Shape implements IShape{
    double l, w;
    public Rectangle(double _l, double _w){
        l = _l;
        w = _w;
    }

    @Override
    public double circumstance() {
        return 2*(l+w);
    }

    @Override
    public double area() {
        return l*w;
    }

    @Override
    public void welcome() {
        System.out.println("Welcome working Rectangle");
    }
}
