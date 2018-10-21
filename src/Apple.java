public class Apple extends Fruit{
    private String name = "Táo";

    public Apple()
    {
        super();
    }
    public Apple(String id, String original, double price, double amount) {
        super(id, original, price, amount);
    }

    public String toString()
    {
        return super.toString(name);
    }
}
