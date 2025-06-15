//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("");

        /*System.out.println(Block2.abs(-2));
        System.out.println(Block2.safeDiv(4,0));
        System.out.println(Block2.max(4,-8));
        System.out.println(Block2.makeDecision(5, -4));
        System.out.println(Block2.max3(8,7,7));
        System.out.println(Block2.sum3(10,6,4));
        System.out.println(Block2.sum2(11,3));
        System.out.println(Block2.is35(3));
        System.out.println(Block2.magic6(0,6));*/
        System.out.println(Block2.age(10));


    }
}

class Block2{
    public static int abs(int x){
        return x < 0 ? x * (-1) : x;
    }

    public static int safeDiv(int x, int y)
    {
        return y!=0 ? x/y : 0;
    }

    public static int max(int x, int y)
    {
        return x >=y ? x : y;
    }

    public static String makeDecision(int x, int y){
            String str = "";
            if (x < y ){
                str = x + "<" + y;
            }
            else if (x > y)
            {
                str =  x + ">" + y;
            }

            else if (x == y)
            {
                str =  x + "==" + y;
            }
            return str;
    }

    public static int max3(int x, int y, int z)
    {
        int max = 0;
        if((x>=y && y <= z) || ((x>=y && y >= z)))
        {
            max = x;
        }
        else if (x <= y && y <= z) {
                max = z;
        }
        else
            {
            max = y;
            }
        return max;
    }

    public static boolean sum3(int x, int y, int z){
        if ((x + y == z) || (x + z == y) || (y + z == x))
        {
            return true;
        }
        else
            return false;
    }

    public static int sum2(int x, int y){
        return (x + y) >= 10 && (x + y) <= 19 ? x + y : 20;
    }

    public static boolean is35(int x)
    {
        if ((x%3==0 && x%5!=0) || (x%5==0 && x%3!=0))
        {
            return true;
        }
        else
            return false;
    }

    public static boolean magic6(int x, int y)
    {
        if ((x+y == 6) || (x-y == 6) || (y - x == 6) || x == 6 || y == 6){
            return true;
        }
        else
            return false;
    }

    public static String age(int x)
    {
        //int z = x % 10;
        if (x % 10 == 1 && x != 11)
        {
            return x + " год";
        }
        else if ((x % 10 == 2 && x != 12 && x != 13 && x != 14)  || (x % 10 == 3 && x != 12 && x != 13 && x != 14) || (x % 10 == 4 && x != 12 && x != 13 && x != 14))
        {
            return x + " года";
        }
        else
            return x + " лет";
    }




}

