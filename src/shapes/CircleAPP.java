package shapes;
import util.Input;

public class CircleAPP {
    public static void main(String[] args){
        Input input = new Input();
        System.out.println("What is the Radius of the circle");
        double radius = input.getDouble();
        System.out.println("The radius is " + radius);
        Circle circle = new Circle(radius);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
