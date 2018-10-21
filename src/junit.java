public class junit {
    private int number1;
    private int number2;

    public junit(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public static int Max(int number1, int number2)
    {
        if(number1 > number2) return number1;
        else return number2;
    }
}
