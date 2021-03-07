package activity;

public class Rectangle extends Shape {

    private double length;
    private double breath;

    //Behavior - default constructor
    public Rectangle(){
        System.out.println("I'm Shape constructor");
    }

    //Behavior - parameterized constructor
    public Rectangle(double length, double breath){
        this.length = length;
        this.breath = breath;
    }

    public double calculateArea(){
        return length*breath;
    };

    public double calculatePerimeter() {
        return 2*(length + breath);
    }

}