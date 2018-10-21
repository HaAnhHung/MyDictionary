import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction()
    {
        this.numerator = 1;
        this.denominator = 1;
    }
    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public static int UCLN(int a , int b)
    {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b)
        {
            if(a > b) a = a-b;
            else b = b-a;
        }
        return a;
    }
    public static Fraction toReduce(Fraction fraction)
    {
        int UCLN = UCLN(fraction.numerator, fraction.denominator);
        if(fraction.denominator > 0)
        {
            fraction.numerator = fraction.numerator / UCLN;
            fraction.denominator = fraction.denominator / UCLN;
        }
        else if(fraction.numerator < 0 && fraction.denominator < 0)
        {
            fraction.numerator = Math.abs(fraction.numerator);
            fraction.denominator = Math.abs(fraction.denominator);
            fraction.numerator = fraction.numerator / UCLN;
            fraction.denominator = fraction.denominator / UCLN;
        }
        else if(fraction.denominator < 0 && fraction.numerator > 0)
        {
            fraction.numerator = fraction.numerator*(-1);
            fraction.denominator = Math.abs(fraction.denominator);
            fraction.numerator = fraction.numerator / UCLN;
            fraction.denominator = fraction.denominator / UCLN;
        }
        return fraction;
    }

    public boolean equals(Fraction fraction)
    {
        if(this.numerator*fraction.denominator == this.denominator*fraction.numerator)
            return true;
        else return false;
    }

    public static Fraction Sum(Fraction fraction1, Fraction fraction2)
    {
        Fraction fraction = new Fraction();
        fraction.numerator = fraction1.numerator*fraction2.denominator + fraction2.numerator*fraction1.denominator;
        fraction.denominator = fraction1.denominator*fraction2.denominator;
        int UCLN = UCLN(fraction.numerator, fraction.denominator);
        fraction = toReduce(fraction);
        return fraction;
        //System.out.println(fraction.numerator + "/" + fraction.denominator);
    }
    public static void Subtract(Fraction fraction1, Fraction fraction2)
    {
        Fraction fraction = new Fraction();
        fraction.numerator = fraction1.numerator*fraction2.denominator - fraction2.numerator*fraction1.denominator;
        fraction.denominator = fraction1.denominator*fraction2.denominator;
        if(fraction.numerator == 0 || fraction.denominator == 0) System.out.println(0);
        else{
            int UCLN = UCLN(fraction.numerator, fraction.denominator);
            fraction = toReduce(fraction);
            System.out.println(fraction.numerator + "/" + fraction.denominator);
        }
    }
    public static void Multiplication(Fraction fraction1, Fraction fraction2)
    {
        Fraction fraction = new Fraction();
        fraction.numerator = fraction1.numerator*fraction2.numerator;
        fraction.denominator = fraction1.denominator*fraction2.denominator;
        int UCLN = UCLN(fraction.numerator, fraction.denominator);
        fraction = toReduce(fraction);
        System.out.println(fraction.numerator + "/" + fraction.denominator);
    }
    public static void Division(Fraction fraction1, Fraction fraction2)
    {
        Fraction fraction = new Fraction();
        fraction.numerator = fraction1.numerator*fraction2.denominator;
        fraction.denominator = fraction1.denominator*fraction2.numerator;
        if(fraction.denominator == fraction.numerator) System.out.println(1);
        else{
            int UCLN = UCLN(fraction.numerator, fraction.denominator);
            fraction = toReduce(fraction);
            System.out.println(fraction.numerator + "/" + fraction.denominator);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Moi nhap vao cac gia tri");
        int numerator1 = new Scanner(System.in).nextInt();
        int denominator1 = new Scanner(System.in).nextInt();
        int numerator2 = new Scanner(System.in).nextInt();
        int denominator2 = new Scanner(System.in).nextInt();
        Fraction fraction1 = new Fraction(numerator1, denominator1);
        Fraction fraction2 = new Fraction(numerator2, denominator2);
        Fraction fraction = Sum(fraction1, fraction2);
        System.out.println(fraction.numerator+"/"+fraction.denominator);
        Subtract(fraction1, fraction2);
        Multiplication(fraction1, fraction2);
        Division(fraction1, fraction2);
        if(fraction1.equals(fraction2) == true)
            System.out.println("Hai phan so bang nhau");
        else System.out.println("Hai phan so khac nhau");
    }
}