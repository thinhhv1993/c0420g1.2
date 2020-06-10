package Bai6.kethua.baitap.bai1.CircleVSCylinder;

public class Circle {
    private double radius ;
    protected String color ;
    final double PI =  3.14;
    public Circle(){

    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                ", color='" + color + '\'' +
                '}';
    }
}
