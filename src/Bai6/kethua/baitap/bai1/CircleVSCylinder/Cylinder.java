package Bai6.kethua.baitap.bai1.CircleVSCylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double volume(){
        return getHeight() * getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "volume = " + volume()+
                ", color='" + color + '\'' +
                super.toString() +
                '}';
    }
}
