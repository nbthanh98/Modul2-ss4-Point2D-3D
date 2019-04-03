public class Point3D extends Point2D{

    private float z = 0.0f;

    public Point3D(){}

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float x) {
        this.z = x;
    }

    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float result[] = {getX(), getY(), z};
        return result;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() +")";
    }
}
