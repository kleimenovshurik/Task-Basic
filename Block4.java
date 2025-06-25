package edu.math;

public class Block4 {
    /** 4.1*/
    public static String listNums(int x) {
        int[] arr = new int[x + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr+"";
    }

    /** 4.2*/
    public static String reverseListNums(int x)
    {
        int [] arr = new int[x+1];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = x;
            x = x-1;
        }
        return arr+"";
    }

    /** 4.3*/
    public static String chet(int x)
    {
        int perem = 0;
        int[] arr = new int[(x/2+1)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = perem;
            perem=perem+2;
        }
        return arr+"";
    }


    /** 4.4*/
    public static int pow(int x, int y)
    {
        int result = 1;
        int [] arr = new int[y];
        {
            for (int i = 0; i < arr.length; i++) {
                result = result * x;
            }
        }
        return result;
    }

    /** 4.5*/
    public static int numLen(long x){
        int res = 0;
        do
        {
            x = x /10;
            res = res + 1;
        }
        while (x>0);
        return res;
    }

    /** 4.6*/
    public static boolean equalNum(int x){
        boolean flag=true;
        int ost = 0;
        int [] arr = new int[x];
        int i = 0;

        do {
            ost = x % 10;
            arr[i] = ost;
            x = x /10;
            i++;
        } while (x> 0);

        for (int j = 0;j< arr.length; j++)
        {
            if(arr[j]!=arr[0]) flag=false;
        }

        return flag;
    }

    /** 4.7*/
    public static void square(int x)
    {
        int[][] arr = new int[x][x];
        for(int i = 0; i<x; i++)
        {
            for(int j = 0; j<x; j++ )
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    /** 4.8*/
    public static void leftTriangle(int x){
        int[][] arr = new int[x][];
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /** 4.9*/
    public static void rightTriangle(int x)
    {
        int[][] arr = new int[x][];
        for(int i = 0; i < x; i++)
        {
            for(int j = 0 ; j<x-i-1; j++){
                System.out.print(" ");
            }
            int stars = 0;
            do {
                System.out.print("*");
                stars++;
            } while (stars <= i);
            System.out.println("");
        }
    }
    /**4.10*/
    public static int guessGame() {
        boolean flag = true;
        int count = 1;
        while (true){
            int randomNum = 3;
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("What number am I thinking (0 to 9)? :");
            int x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
                break;
            }
            count++;
        }
        return count;
    }






    /**
     * Вспомогательный метод для создания массива с числами от 0 до x.
     *
     * @param x верхняя граница диапазона
     * @return массив с числами от 0 до x
     */
    public static int[] listNums2(int x) {
        int[] arr = new int[x + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;

    }

    /**
     * Вспомогательный метод для вывода элементов массива.
     * Не предназначен для использования вне внутренней логики.
     */
    public static int[] PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }
}
