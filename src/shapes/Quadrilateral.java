package shapes;

public abstract class Quadrilateral implements Shape {

    protected float length;
    protected float width;

    public Quadrilateral(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength(){
        return length;
    }

    public float getWidth(){
        return width;
    }

    public abstract float setLength();

    public abstract float setWidth();


}
