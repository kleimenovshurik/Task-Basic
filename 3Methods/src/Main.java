//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("");

        System.out.println(Block2.abs(-2));
        System.out.println(Block2.safeDiv(4,0));
        System.out.println(Block2.max(4,-8));
        System.out.println(Block2.makeDecision(5, -4));
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



}

