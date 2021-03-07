package activity;

import java.awt.*;

public class AbstractionActivity {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,6);
        rectangle.setColor("Grey");
        System.out.println("Rectangle color " + rectangle.getColor());
        System.out.println("Rectangle area " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter " + rectangle.calculatePerimeter());

        Shape circle = new Circle(5);
        circle.setColor("Purple");
        System.out.println("Circle color " + circle.getColor());
        System.out.println("Circle area " + circle.calculateArea());
        System.out.println("Circle perimeter " + circle.calculatePerimeter());
    }
}
