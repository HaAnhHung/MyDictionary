package Question2;

public class Circle extends Shape {
    private double radius = 1.0;
    private final double PI = 3.14;

    public Circle(){
        super();
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*2*PI;
    }

    public double getPerimeter(){
        return radius*radius*PI;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius = " + radius + "\nArea = " + getArea() + "\nPerimeter = " + getPerimeter();
    }
}
