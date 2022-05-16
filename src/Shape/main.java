package Shape;

public class main {
    public static void main(String[] args) {
        Triangle triangle= new Triangle();
        System.out.println(triangle);
        Triangle triangle1= new Triangle("blue","tam giac",4,8,2);
        System.out.println(triangle1);
        triangle1.setShape("hinh vuong");
        System.out.println(triangle1);

    }
}
