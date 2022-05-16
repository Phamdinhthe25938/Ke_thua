package kethua;

public class main {
    public static void main(String[] args) {
         Circle circle= new Circle();
        System.out.println(circle);
        circle.setRadius(3);
        System.out.println(circle);
        Circle circle1= new Circle("blue",false,2.5);
        System.out.println(circle1);
        System.out.println("dien tich hinh tron:"+circle1.getArea());
        Square square = new Square();
        System.out.println(square);
        square.setSide(4);
        System.out.println(square);
    }
}
