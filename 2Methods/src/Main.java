//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("");
        System.out.println(fraction(2.298));
        System.out.println(sumLastNums(4216788));
        System.out.println(charToNum('6'));
        System.out.println(isPositive(-1));

    }

    public static double fraction(double x)
    {
        int a = (int)(x);
        double b = (double)(a);
        double c = x - b;
        return c;
    }


    public static int sumLastNums(int x)
    {
        int LastNumber = 0;
        int PreLastNumber = 0;
        int sum = 0;
        LastNumber = x % 10;
        PreLastNumber = (x % 100) /10;
        sum = LastNumber + PreLastNumber;
        return sum;
    }

    public static int charToNum(char x)
    {
        switch (x) {
            case '0':
                return 48;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
        }
        return x;
    }


    public static boolean isPositive(int x)
    {
        return x > 0 ? true : false;
    }

}