package movePoint;

public class main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        Point point1= new Point(3,6);
        point1.setXY(5,8);
        point1.getXY();
        point.setX(3);
        System.out.println(point);
        System.out.println(point1);
    }
}
