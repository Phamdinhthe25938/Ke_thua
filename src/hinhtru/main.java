package hinhtru;

import hinhtru.Circle;
import hinhtru.Cylinder;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"blue");
        System.out.println(circle);
        System.out.println("dien tich hinh tron:"+circle.getArea());
        Cylinder cylinder = new Cylinder(3,"yellow", 4);
        System.out.println(cylinder);
        System.out.println("dien tich hinh tru:"+cylinder.getArea());
    }
}
