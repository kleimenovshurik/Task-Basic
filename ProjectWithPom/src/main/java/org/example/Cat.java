package org.example;
import java.util.Arrays;
public class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString(){
            return "кот: " + this.name;
        }

        public void toMeow(){
            System.out.println(this.name + ": " + "мяу!");
        }

        public void toMeow(int N){
            String tmp = "мяу";
            while (N-1>0){
                tmp = tmp + "-мяу";
                N--;
            }
            System.out.println(this.name + ": " + tmp +"!");

        }


    /*String tmp = "";
        for (int i = 0; i < new []; i++){
        tmp = tmp + "мяу";
    }
        System.out.println(this.name + tmp);*/


}
