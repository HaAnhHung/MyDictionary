public class Car{
    private String carManufacturer;
    private String carColor;
    private double maxSpeed;
    private double price;
    private String version;

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Car(String carManufacturer, String carColor, double maxSpeed, double price, String version) {
        this.carManufacturer = carManufacturer;
        this.carColor = carColor;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.version = version;
    }
}
