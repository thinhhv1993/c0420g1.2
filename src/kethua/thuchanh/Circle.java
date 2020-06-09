package kethua.thuchanh;

public class Circle extends Shape {
    private  double radius = 1.0;
    final double PI =  3.14;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double Are =  Math.pow(getRadius(), 2) * PI;
        return Are;
    }

    public double getPerimeter(){
        return 2 * PI * getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                super.toString()+
                '}';
    }

}
