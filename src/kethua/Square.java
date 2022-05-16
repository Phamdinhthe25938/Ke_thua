package kethua;

public class Square extends Rectangle{
     public Square(double side){
         super(side,side);
     }
     public Square(){

     }
    public Square(String color, boolean filled, double width, double height) {
        super(color, filled, width, height);
    }
    public double getSide(){
         return getWidth();
    }
    public void setSide(double side){
        setHeight(side);
        setWidth(side);
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }
    @Override
    public String toString() {
        return "Square: side="+getSide()+super.toString();
    }
}
