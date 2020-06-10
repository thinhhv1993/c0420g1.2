package Bai7.AbtractClassVsInterface.baitap.bai1.TrienKhaiInterFace.Resizeable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Circle[] circle =new Circle[2];
//        circle[0] = new Circle(3.6);
//        circle[1] = new Circle(3.6);
//        circle[1].resize(50.0);
//
//        System.out.println("Pre-sorted:");
//        for (Circle circles : circle) {
//            System.out.println(circles);
//        }
//        System.out.println(circle[0].getArea());
//        System.out.println(circle[0].getPerimeter());
//        System.out.println(circle[1].getArea());
//        System.out.println(circle[1].getPerimeter());
//
//        Rectangle[] rectangles =new Rectangle[2];
//        rectangles[0] = new Rectangle(5,10);
//        rectangles[1] = new Rectangle(5,10);
//        rectangles[1].resize(50.0);
//
//        System.out.println("Pre-sorted:");
//        for (Rectangle rectangle : rectangles) {
//            System.out.println(rectangle);
//        }
//        System.out.println(rectangles[0].getArea());
//        System.out.println(rectangles[0].getPerimeter());
//        System.out.println(rectangles[1].getArea());
//        System.out.println(rectangles[1].getPerimeter());
//        double percent = Math.round(Math.random() * 1000);
//        System.out.println(percent);
//
//        Square[] squares =new Square[2];
//        squares[0] = new Square(5);
//        squares[1] = new Square(5);
//        squares[1].resize(percent);
//
//        System.out.println("Pre-sorted:");
//        for (Square square : squares) {
//            System.out.println(square);
//        }
//        System.out.println(squares[0].getArea());
//        System.out.println(squares[0].getPerimeter());
//        System.out.println(squares[1].getArea());
//        System.out.println(squares[1].getPerimeter());

//        ComparableCircle[] circles = new ComparableCircle[3];
//        circles[0] = new ComparableCircle(3.6);
//        circles[1] = new ComparableCircle();
//        circles[2] = new ComparableCircle(3.5, "indigo", false);
//
//        System.out.println("Pre-sorted:");
//        for (ComparableCircle circle : circles) {
//            System.out.println(circle);
//        }
//
//        Arrays.sort(circles);
//
//        System.out.println("After-sorted:");
//        for (ComparableCircle circle : circles) {
//            System.out.println(circle);
//        }

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5, "blue", true);
        Circle a = (Circle) shapes[0];
        System.out.print("Diện thích hình tròn :");
        System.out.println(a.getArea());

        shapes[1] = new Rectangle(5, 10, "null", false);
        Rectangle b = (Rectangle) shapes[1];
        System.out.print("Diện thích hình chữ nhật :");
        System.out.println(b.getArea());

        shapes[2] = new Square(5,"yellow", true);
        Square c = (Square) shapes[2];
        System.out.print("Diện thích hình vuông :");
        System.out.println(c.getArea());
        if(c.getColor()!= null){
            c.howToColor();
        }else {
            System.out.println("C không có màu");
        }

    }
}
