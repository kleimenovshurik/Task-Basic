//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("");

        System.out.println(Block2.abs(-2));
        System.out.println(Block2.safeDiv(2,0));
    }
}

class Block2{
    public static int abs(int x){
        return x < 0 ? x * (-1) : x;
    }

    public static int safeDiv(int x, int y)
    {
        int result = 1;
        if (y!=0)
        {
            result = x/y;
        }
        else
        {
            result = 0;
        }
        return result;
    }


}

