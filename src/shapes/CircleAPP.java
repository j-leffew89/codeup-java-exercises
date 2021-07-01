package shapes;
import util.Input;
import java.text.DecimalFormat;

public class CircleAPP {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args){
        Input input = new Input();
        System.out.println("What is the Radius of the circle: ");
        double radius = input.getDouble();
        System.out.println("The radius is " + radius);
        Circle circle = new Circle(radius);
        System.out.println("The area is: " + df.format (circle.getArea()));
        System.out.println("The circumference is: " + df.format (circle.getCircumference()));
    }
}
