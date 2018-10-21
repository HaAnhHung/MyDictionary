import java.util.Random;
import java.util.Scanner;

public class Guest {
    public static int Random()
    {
        Random random = new Random();
        int number = random.nextInt(100)+1;
        return number;
    }

    public static int PersonGeust()
    {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao du doan cua ban: ");
        int numberGuest = scaner.nextInt();
        return numberGuest;
    }

    public static void Equals()
    {
        int count = 0;
        int number = Random();
        for(int i=0;i<10;i++)
        {
            count ++;
            int numberGuest = PersonGeust();
            if(numberGuest > number)
                System.out.println("So ban doan lon hon so can doan!!");
            if(numberGuest < number)
                System.out.println("So ban nhap nho hon so can doan!!");
            if(numberGuest == number)
            {
                System.out.println("Ban doan dung roi!Oh yeahhh!!!");
                break;
            }
            if(count == 10 && numberGuest!=number)
                System.out.println("Game Over! Ban co gang len nhe!!");
        }
    }

    public static void main(String[] args)
    {
        Equals();
    }
}
