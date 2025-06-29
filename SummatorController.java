package ru.mfti;

import mfti.massiv.Block5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


//REST API
@RestController
class SummatorController {

    @GetMapping("/makeHomeWork")
    public String arithmeticExpression2(String expression) {
        System.out.println("Получено выражение: " + expression);
        return fun2(expression);
    }
    
    @GetMapping("/make")
    public String arithmeticExpression(String expression) {
        System.out.println("Получено выражение: " + expression);
        return fun(expression);
    }

    @GetMapping("/arr")
    public int[] array () {
        System.out.println("Получен массив: " );
        return new int []{1,2,3};
    }

    @GetMapping("/arr2")
    public int array (@RequestParam int num, @RequestBody int [] data) {
        System.out.println("Получен массив: " );
        int res = Block5.findFirst(data, num);
        return res;
    }


	//логику писать сюда
    public static String fun(String expression){
        //return "42";
        char [] c = expression.toCharArray();
        int perem;
        String [] str = expression.split("[\\+\\-\\*\\/]");
        String [] strZnak = expression.split("[0-9]");
        String [] arrNew = new String[str.length-1];

        for(int j =0,  i = 0; i < strZnak.length; i++){
            if (strZnak[i].equals("-")  || strZnak[i].equals("+") || strZnak[i].equals("*") || strZnak[i].equals("/")) {
                arrNew[j] = strZnak[i];
                j++;
            }
        }

        int indexMult = 0;

        for(int i = 0; i < arrNew.length; i++) {
            if (arrNew[i].equals("*")) {
                indexMult = i;
            }
        }

        String [] strNew = new String[str.length-1];
            for(int i = 0; i < indexMult; i++){
                strNew[i] = str[i];

            }


            for(int i = indexMult; i < strNew.length; i++)
            {

                if(i!=indexMult){
                    strNew[i] = str[i+1];
                }
                else{
                    strNew[indexMult] = Integer.parseInt(str[i]) * Integer.parseInt(str[i+1])+ "";
                }

            }

        String [] arrNewWithoutMult = new String[arrNew.length-1];
            for(int i = 0, j=0; i < arrNew.length; i++){
                if(arrNew[i].equals("+") || arrNew[i].equals("-"))
                {
                    arrNewWithoutMult[j] = arrNew[i];
                    j++;
                }
            }

        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(strZnak));
        System.out.println(Arrays.toString(strNew));
        System.out.println(Arrays.toString(arrNew));
        System.out.println(Arrays.toString(arrNewWithoutMult));

        perem = Integer.parseInt(strNew[0]);
        for(int i = 0; i < strNew.length-1; i++){
            if(arrNewWithoutMult[i].equals("-")){
                perem = perem - Integer.parseInt(strNew[i+1]);
            }
            if(arrNewWithoutMult[i].equals("+")) {
                perem = perem + Integer.parseInt(strNew[i+1]);
            }
        }

        return perem + "";
    }


    public static String fun2(String expression){
        char [] c = expression.toCharArray();

        int perem;
        String [] str = expression.split("[\\+\\-\\*\\/]");
        String [] str2 = expression.split("[0-9]");
        String [] arrNew = new String[str.length-1];

        for(int j =0,  i = 0; i < str2.length; i++){
            if (str2[i].equals("-")  || str2[i].equals("+") || str2[i].equals("*") || str2[i].equals("/")) {
                arrNew[j] = str2[i];
                j++;
            }
        }



        perem = Integer.parseInt(str[0]);
        for(int i = 0; i < str.length-1; i++){
                if(arrNew[i].equals("-")){
                    perem = perem - Integer.parseInt(str[i+1]);
                }
                if(arrNew[i].equals("+")) {
                    perem = perem + Integer.parseInt(str[i+1]);
                }
        }



        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(str2));
        System.out.println(Arrays.toString(arrNew));


        return perem+"";
    }

}

        /*for(int j = 0, i = count; i < str2.length; j++, i++)
        {
            arrNew[j]
        }*/

