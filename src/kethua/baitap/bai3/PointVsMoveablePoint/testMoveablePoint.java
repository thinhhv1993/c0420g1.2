package kethua.baitap.bai3.PointVsMoveablePoint;

public class testMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        MoveablePoint moveablePoint1 = new MoveablePoint(1,1,2,2);
        System.out.println(moveablePoint1);
        moveablePoint1.move();
        System.out.println(moveablePoint1);

    }
}
