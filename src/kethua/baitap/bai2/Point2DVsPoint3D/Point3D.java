package kethua.baitap.bai2.Point2DVsPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){}

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y , float z){
        super.getX();
        super.getY();
        this.z = z;
    }
    public float[] getXYZ() {
        float[] getXYZ = new float[3];
        getXYZ[0] = super.getX();
        getXYZ[1] = super.getY();
        getXYZ[2] = this.z;
        return getXYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                super.toString()+
                "\nArray[x,y] = " + Arrays.toString(getXYZ())+
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(3, 5, 7);
        System.out.println(point3D);
    }
}
