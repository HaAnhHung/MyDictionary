public class SmartPhone {
    private String nameOfPhone;
    private String screen;
    private String microprocessor;
    private String ram;
    private String camera;
    private String power;
    private String operatingSystem;
    private double price;

    public String getNameOfPhone() {
        return nameOfPhone;
    }

    public void setNameOfPhone(String nameOfPhone) {
        this.nameOfPhone = nameOfPhone;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMicroprocessor() {
        return microprocessor;
    }

    public void setMicroprocessor(String microprocessor) {
        this.microprocessor = microprocessor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        ram = ram;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SmartPhone(String nameOfPhone, String screen, String microprocessor, String ram, String camera, String power, String operatingSystem, double price) {
        this.nameOfPhone = nameOfPhone;
        this.screen = screen;
        this.microprocessor = microprocessor;
        this.ram = ram;
        this.camera = camera;
        this.power = power;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }
}
