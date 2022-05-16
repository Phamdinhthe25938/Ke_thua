package kethua;

public class Rectangle extends Shape{
    private double width=1;
    private  double height=1;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }
    public double getArea(){
        double area= this.height*this.width;
        return area;
    }
    public  double chuVi(){
        double chuVi= (this.height+this.width)*2;
        return chuVi;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                '}'+super.toString();
    }
}
