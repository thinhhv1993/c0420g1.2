package LopVsDoiTuong.baitap.bai3.xaydunglopFan;

public class Fan {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST  = 3;
        private int speed;
        private boolean on;
        private  double radius;
        private String color;

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){
        this.speed=SLOW;
        this.on=false;
        this.radius=5;
        this.color="Blue";
    }
    public String toString() {
        if (this.on == true ) {
            return "Speed: " + this.speed + ";Status: " + this.on + "; Radius: " + this.radius + "; Color: " + this.color + " fan is on";
        } else {
            return "Speed: " + this.speed + ";Status: " + this.on + "; Radius: " + this.radius + "; Color: " + this.color + " fan is off";
        }
    }

    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan fan1=new Fan();
        fan1.setOn(true);
        fan1.setColor("blue");
        fan1.setRadius(4);
        fan1.setSpeed(fan1.FAST);
        System.out.println(fan1.toString());
        Fan fan2=new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setColor("Red");
        fan2.setOn(true);
        System.out.println(fan2.toString());

    }
}
