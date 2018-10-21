public class Dog {
    private String name;
    private int age;
    private String sex;
    private String colorOfFur;
    private double weight;
    private String dogBreed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColorOfFur() {
        return colorOfFur;
    }

    public void setColorOfFur(String colorOfFur) {
        this.colorOfFur = colorOfFur;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public Dog(String name, int age, String sex, String colorOfFur, double weight, String dogBreed) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.colorOfFur = colorOfFur;
        this.weight = weight;
        this.dogBreed = dogBreed;
    }
}
