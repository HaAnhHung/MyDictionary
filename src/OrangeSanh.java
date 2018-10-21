public class OrangeSanh extends Orange {
    private String name = "Cam sành";

    public OrangeSanh(){
        super();
    }

    public OrangeSanh(String id, String original, double price, double amount) {
        super(id, original, price, amount);
    }

    public String toString() {
        return super.toString(name);
    }
}
