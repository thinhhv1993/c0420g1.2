package bai13.debugvsxulyngoaile.baitap.sudunglopIllegalTriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testIllegalTriangleException {
    public static void illegalTriangleException(double a ,double b, double c)  {
        try{
           if(a <= 0 || b <= 0 || c<=0 ||(a+b<c)||(a+c<b)||(b+c<a)){
               throw new IllegalTriangleException("Not a triangle");
           }
           else
               throw new IllegalTriangleException("Is a right triangle ");
        }catch (Exception e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        System.out.println("Nhập 3 cạnh của 1 tam giác");
        Scanner scanner = new Scanner(System.in);
      try {
          System.out.print("\ta: ");
          double a = scanner.nextDouble();

          System.out.print("\tb: ");
          double b = scanner.nextDouble();

          System.out.print("\tc: ");
          double c = scanner.nextDouble();
          illegalTriangleException(a, b, c);
      }catch (InputMismatchException e){
          System.err.println("khong duoc nhap chu");
      }catch (Exception e){
          e.printStackTrace();
      }
    }
}
