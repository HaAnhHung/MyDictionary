public class OrangeCaoPhong extends Orange {
    private String name = "Cam Cao Phong";

    public OrangeCaoPhong(){
        super();
    }

    public OrangeCaoPhong(String id, String original, double price, double amount) {
        super(id, original, price, amount);
    }

    public String toString() {
        return super.toString(name);
    }
}
