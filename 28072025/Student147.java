public class Student147 {
    String name;
    Integer [] marks;

    Student147(String name, Integer[]marks) {
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
}
