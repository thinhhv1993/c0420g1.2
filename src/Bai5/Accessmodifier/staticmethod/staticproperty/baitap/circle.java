package Bai5.Accessmodifier.staticmethod.staticproperty.baitap;

public class circle {
    private double radius = 1.0;
    private String color = "red";

    public circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    public circle(){
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getAre(){
        final double PI =  3.14;
        double Are =  Math.pow(radius, 2) * PI;
        return Are;
    }
}
