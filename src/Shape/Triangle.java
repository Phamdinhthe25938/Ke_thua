package Shape;

public class Triangle extends Shape{
    private double side1=1;
    private double side2=1;
    private double side3=1;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, String shape, double side1, double side2, double side3) {
        super(color, shape);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        double cv = this.getSide1()+this.getSide2()+this.getSide3();
        return  cv;
    }
    public double getArea(){
       double ncv = this.getPerimeter()/2;
       double s = Math.sqrt(ncv*(ncv-getSide1()*(ncv-getSide2())*(ncv*getSide3())));
       return s;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + getSide1() +
                ", side2=" + getSide2() +
                ", side3=" + getSide3() +"chu vi:"+getPerimeter()+
                "dien tich:"+getArea()+
                super.toString()+
                '}';
    }
}
