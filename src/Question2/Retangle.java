package Question2;

public class Retangle extends Shape {
    private double width = 1.0;
    private double lenght = 1.0;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public Retangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public Retangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Retangle() {
    }
    public double getArea()
    {
        return width*lenght;
    }
    public double getPerimeter()
    {
        return 2*(width+lenght);
    }

    @Override
    public String toString() {
        return super.toString()+"\nWidth = "+width+"\nLenght = "+lenght+"\nArea = "+getArea()+"\nPerimeter = "+getPerimeter();
    }
}
