import java.util.Scanner;

public class bai1_tuan3 {
    public static int UCLN(int a , int b)
    {
        while (a != b)
        {
            a = Math.abs(a);
            b = Math.abs(b);
            if(a > b) a = a-b;
            else b = b-a;
        }
        return a;
    }
    public static int Fibonaci(int n)
    {
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return (Fibonaci(n-1)+Fibonaci(n-2));
    }
    public static void main(String[] args)
    {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        System.out.println("UCLN cua 2 so la " + UCLN(a,b));
        int n = new Scanner(System.in).nextInt();
        System.out.println("Fibonaci cua "+ n + " la " + Fibonaci(n));
    }
}
