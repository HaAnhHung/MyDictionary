public class Fruit {
    protected String id;
    protected String original;
    protected double price;
    protected double amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Fruit(){

    }

    public Fruit(String id, String original, double price, double amount) {
        this.id = id;
        this.original = original;
        this.price = price;
        this.amount = amount;
    }

    public String toString(String name) {
        return "Name: " + name + "\n" + "ID: " + id + "\n" + "Original: " + original + "\n" + "Price: " + price + " đồng/kg"
                + "\n" + "Amount: " + amount + " quả";
    }
}
