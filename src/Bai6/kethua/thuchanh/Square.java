package Bai6.kethua.thuchanh;

public class Square extends Rectangle{
    public Square(){
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side){
        super(side, side);
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLenght(side);
    }

    @Override
    public void setLenght(double lenght) {
        super.setLenght(lenght);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
