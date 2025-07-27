public class Student {
    String name;
    Integer [] marks;

    public String toString(){
        String str1 = "";
        for (int i = 0; i < marks.length; i++){
            str1 = str1 + marks[i] +" ";
        }
        return name+ ":" + str1;
    }
}
