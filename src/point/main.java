package point;

public class main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3,2);
        System.out.println(point2D);
        point2D.setXY(5,7);
        point2D.getXY();
        Point3D point3D1 = new Point3D();
        System.out.println(point3D1);
        Point3D point3D = new Point3D(point2D.getX(), point2D.getY(),5);
        System.out.println(point3D);
        point3D.getXYZ();
    }
}
