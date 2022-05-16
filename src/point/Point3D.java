package point;

public class Point3D extends Point2D{
    private  float z=0;

    public Point3D() {
        this.z=6;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        setXY(x,y);
        this.z=z;
    }
    public void getXYZ(){
        float array[]={getX(),getY(),z};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    @Override
    public String toString() {
        return "Point3D{" +
                  getX()+","+getY()+","+getZ()+
                '}';
    }
}
