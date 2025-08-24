package org.example;

public class ExcelentStudent {
        String name;
        Integer [] marks;

        ExcelentStudent(String name, Integer[]marks) {
            this.name = name;
            if (marks != null) {
                this.marks = marks;
            } else {
                this.marks = new Integer[0];
            }
        }

        public String toString(){
            String str1 = "";
            for (int i = 0; i < marks.length; i++){
                str1 = str1 + marks[i] +" ";
            }
            return name+ ":" + str1;
        }

        public float avgMark(){
            int count = 0;
            float avgMark =0;
            if (this.marks.length!=0) {
                for (int i = 0; i < this.marks.length; i++) {
                    avgMark = avgMark + this.marks[i];
                    count++;
                }
                avgMark = avgMark / count;
            }
            return avgMark;
        }

        public boolean isClever(){
            int a = 5;
            boolean isClever = true;
            if (this.marks.length!=0) {
                for (int i = 0; i < this.marks.length; i++) {
                    if(marks[i]!=a){
                        isClever = false;
                    }
                }
            }
            return  isClever;
        }


    }

