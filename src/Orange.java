public class Orange extends Fruit{

    private String name = "Cam thường";

    public Orange(){
        super();
    }

    public Orange(String id, String original, double price, double amount) {
        super(id, original, price, amount);
    }

    public String toString() {
        return super.toString(name);
    }
}
