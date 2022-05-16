package movePoint;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public void getSpeed(){
        float array[]= {getxSpeed(),getySpeed()};
        for(int i=0;i<=array.length;i++){
            System.out.println(array[i]);
        }
    }

//        public float move(){
//
//        super.getX() +=getxSpeed();
//        super.getY() +=getySpeed();
//
//    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                super.toString()+
                "xSpeed=" + getySpeed() +
                ", ySpeed=" + getySpeed() +
                '}';
    }
}
