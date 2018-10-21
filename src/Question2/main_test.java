package Question2;

public class main_test {
    public static void main(String[] args)
    {
        Shape circle = new Circle();
        System.out.println(circle.toString()+"\n");
        Shape shape = new Retangle(15,20);
        System.out.println(shape.toString()+"\n");
        Shape square = new Square(20);
        System.out.println(square.toString());
    }
}
