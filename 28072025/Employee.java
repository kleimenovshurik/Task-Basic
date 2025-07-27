public class Employee {
    String name;
    Department otdel;


    public String toString(){
        String str1 = "";

        if (!otdel.boss.name.equals(name) && otdel != null && !otdel.nazvanieOtdela.isEmpty() && !otdel.boss.name.isEmpty()){
            str1 = name + " работает в отделе " + otdel.nazvanieOtdela;
        }

        if(otdel.boss.name.equals(name))
        {
            str1 = name + " начальник отдела " + otdel.nazvanieOtdela;
        }

        return str1;
    }
}
