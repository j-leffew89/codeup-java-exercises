package shapes;

public class ShapeTest {

    public static void main(String[] args) {
        Square square1 = new Square(30);
        System.out.println(square1.getPerimeter());

        Rectangle box1 = new Rectangle(10,6);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(20);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

    }

}
