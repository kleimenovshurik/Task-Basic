public class Block5 {
    /** 5.1 Поиск первого значения */
    public static int findFirst(int[] arr, int x)
    {
        int index = -1;
        for(int i=0; i < arr.length; i++)
        {
            if (arr[i] == x)
            {
                index = i;
                break;
            }
            else {

            }
        }
        return index;
    }

    /** 5.2 Поиск последнего значения  */
    public static int findLast(int[] arr, int x){
        int index = -1;
        for(int i=0; i < arr.length; i++)
        {
            if (arr[i] == x)
            {
                index = i;
            }
            else {

            }
        }
        return index;
    }

    /** 5.3 Поиск максимального */
    public static int maxAbs(int[] arr){
        int [] arrNew = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 0)
            {
                arrNew[i] = arr[i] * (-1);
            }
            else {
                arrNew[i] = arr[i];
            }
        }
        int Max = arrNew[0];
        int positionMax = 0;
        for(int i = 0; i < arrNew.length; i++)
        {
            if(arrNew[i] > Max)
            {
                Max = arrNew[i];
                positionMax = i;
            }
        }
        return arr[positionMax];
    }

    /** 5.4 Подсчет позитива*/
    public static int countPositive(int[] arr)
    {
        int count = 0;
        for(int i = 0; i< arr.length; i++)
        {
            if (arr[i] > 0)
            {
                count++;
            }
        }
        return count;
    }

    /** 5.5 Палиндром.  */
    public static boolean palindrom(int[] arr)
    {
        boolean flag = true;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == arr[arr.length -1 - i] )
            {
                flag = true;
            }
            else {
                flag = false;
            }
        }
        return flag;
    }

    /** 5.6 Реверс.  */
    public static void reverse(int[] arr)
    {
        int temp = 0;
        for(int i = 0; i < arr.length / 2; i++)
        {
           temp = arr[i];
           arr[i] = arr[arr.length-1-i];
           arr[arr.length-1-i] = temp;
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
        }
    }

    /** 5.7 Возвратный реверс.   */
    public static int[] reverseBack(int[] arr)
    {
        int [] arrNew = new int[arr.length];

        int temp = 0;
        for(int i = 0; i < arr.length / 2; i++)
        {
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
            arrNew[i] = arr[i];
            arrNew[arrNew.length-1-i] = arr[arr.length-1-i];
        }

        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i]);
            if (i < arrNew.length - 1) {
                System.out.print(", ");
            }
        }

        return arrNew;

    }

    /** 5.8 Объединение.  */
    public static int[] concat(int[] arr1, int[] arr2){
        int [] arrNew = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++)
        {
            arrNew[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++)
        {
            arrNew[arr1.length+i] = arr2[i];
        }

        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i]);
            if (i < arrNew.length - 1) {
                System.out.print(", ");
            }
        }
        return arrNew;
    }

    /** 5.9 Все вхождения */
    public static int[] findAll(int[] arr, int x)
    {
        int j = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == x)
            {
                count++;
            }
        }
        int [] arrNew = new int[count];

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == x)
            {
                arrNew[j] = i;
                j++;
            }
        }

        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i]);
            if (i < arrNew.length - 1) {
                System.out.print(", ");
            }
        }

        return arrNew;
    }



}
