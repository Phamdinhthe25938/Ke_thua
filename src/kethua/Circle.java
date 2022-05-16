package kethua;

public class Circle extends Shape {
    private double radius=1;
    public Circle(){
      super();
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area = Math.PI*this.radius*this.radius;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                '}'+super.toString();
    }
}
