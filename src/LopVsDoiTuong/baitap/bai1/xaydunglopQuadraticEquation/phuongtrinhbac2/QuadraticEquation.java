package LopVsDoiTuong.baitap.bai1.xaydunglopQuadraticEquation.phuongtrinhbac2;


import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta;
        delta = getB() * getB() - 4 * getA() * getC();
        return delta;
    }

    public String checkDelta() {
        String str = "";
        if (getDiscriminant() > 0) {
            str = "Phuong trình có nghiệm : x1" + getRoot1() + "\n" + "Phuong trình có nghiệm : x2" + getRoot2();
        } else if (getDiscriminant() == 0) {
            str = "phương trình có nghiệm kép x1 = x2 = : " + getKep();
        } else {
            str = "phương trình vô nghiệm";
        }
        return str;
    }

    public double getRoot1() {
        double r1;
        r1 = (-getB()) + (Math.sqrt(getDiscriminant())) / (2 * getA());
        return r1;
    }

    public double getRoot2() {
        double r2;
        r2 = (-getB()) - (Math.sqrt(getDiscriminant())) / (2 * getA());
        return r2;
    }

    public double getKep() {
        double x;
        x = -getB() / (2 * getA());
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a:");
        double a = scanner.nextDouble();
        System.out.print("Enter the b:");
        double b = scanner.nextDouble();
        System.out.print("Enter the c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println(quadraticEquation.checkDelta());
    }
}

