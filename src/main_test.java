public class main_test {
    public static void main(String[] args)
    {
        Fruit cam = new Orange("123hi","Việt Nam", 15000,100);
        System.out.println(cam.toString());
        Orange camCP = new OrangeCaoPhong("123bg","Việt Nam", 20000,200);
        System.out.println(camCP.toString());
    }
}
