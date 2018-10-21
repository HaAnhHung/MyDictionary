public class Teacher {
    private String name;
    private int age;
    private String sex;
    private String object;
    private String school;

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

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Teacher(String name, int age, String sex, String object, String school) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.object = object;
        this.school = school;
    }
}
