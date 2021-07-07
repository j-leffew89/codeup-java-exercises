package shapes;

public class Rectangle extends Quadrilateral{

    public Rectangle(double length, double width) {
            super(length, width);

    }

    public void setLength(double length){
        super.length = length;
    }

    public void setWidth(double width){
        super.width = width;
    }

    public double getArea(){
        return length * length;
    }

    public double getPerimeter(){
        return (length * 2) + (width * 2);
    }

//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public Rectangle() {
//    }
//
//    public int getPerimeter() {
//        return (2 * length) + (2 * width);
//    }
//
//    public int getArea() {
//        return (length * width);
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }



}
