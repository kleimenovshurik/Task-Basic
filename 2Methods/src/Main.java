public class Main {
    public static void main(String[] args) {
        /*System.out.printf("Hello and welcome!");
        System.out.println("");
        System.out.println(Block1.fraction(2.298));
        System.out.println(Block1.sumLastNums(4216788));
        System.out.println(Block1.charToNum('6'));
        System.out.println(Block1.isPositive(-1));
        System.out.println("");
        System.out.println(Block1.is2Digits(2));
        System.out.println(Block1.isInRange(7, 7, 7));
        System.out.println(Block1.isDivisor(7, 8));
        System.out.println(Block1.isEquial(8, 8, 7));*/
        int result = 0;
        result = Block1.lastNumSum(Block1.lastNumSum(Block1.lastNumSum(Block1.lastNumSum(5,11), 123), 14), 1)  ;
        System.out.println(result);
        System.out.println(Block1.isUpperCase('Z'));
    }
}

class Block1{
    public static double fraction(double x) {
        int a = (int) (x);
        double b = (double) (a);
        double c = x - b;
        return c;
    }


    public static int sumLastNums(int x) {
        int LastNumber = 0;
        int PreLastNumber = 0;
        int sum = 0;
        LastNumber = x % 10;
        PreLastNumber = (x % 100) / 10;
        sum = LastNumber + PreLastNumber;
        return sum;
    }

    public static int charToNum(char x) {
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


    public static boolean isPositive(int x) {
        return x > 0 ? true : false;
    }

    public static boolean is2Digits(int x) {
        String str = "";
        int len = 0;
        str = String.valueOf(x);
        len = str.length();
        return len == 2 ? true : false;
    }

    public static boolean isUpperCase(char x)
    {
        return x >= 'A' && x <= 'Z';
    }

    public static boolean isInRange(int a, int b, int num) {
        boolean flag = true;
        if (a < b) {
            if (num >= a && num <= b) {
                flag = true;
            } else
                flag = false;
        } else if (a > b) {
            if (num >= b && num <= a) {
                flag = true;
            } else
                flag = false;
        } else
            flag = false;
        return flag;
    }

    public static boolean isDivisor(int a, int b) {
        boolean flag;
        if (a % b == 0 || b % a == 0) {
            flag = true;
        } else
            flag = false;

        return flag;
    }

    public static boolean isEquial(int a, int b, int c) {
        return a == b && a == c ? true : false;
    }

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }
}
