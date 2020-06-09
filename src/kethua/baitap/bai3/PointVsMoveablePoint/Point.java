package kethua.baitap.bai3.PointVsMoveablePoint;

import java.util.Arrays;

public class Point {
    private float X = 0.0f;
    private float Y = 0.0f;

    public Point() {
    }
    ;

    public Point(float x, float y) {
        X = x;
        Y = y;
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        Y = y;
    }

    public void setXY(float x, float y) {
        this.X = x;
        this.Y = y;
    }

    public float[] getXY() {
        float[] getXY = new float[2];
        getXY[0] = this.X;
        getXY[1] = this.Y;
        return getXY;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "X=" + X +
                ", Y=" + Y +
                "\nArray[x,y] = " + Arrays.toString(getXY()) +
                '}';
    }
}
