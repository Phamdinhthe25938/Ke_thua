package hinhtru;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea()*2*getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                super.toString()+'}';
    }
}
