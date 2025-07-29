public class Human146 {
    Name145 name;
    int height;
    Human146 father;

    String nameStr;

    Human146(String nameStr){
        this.nameStr = nameStr;
    }

    Human146(Name145 name){
        this.name = name;
    }

    Human146(Human146 father, String nameStr){
        this.father = father;
        this.nameStr = nameStr;
    }

    Human146(Human146 father, Name145 name){
        this.father = father;
        this.name = name;
    }

    /*public String toString(){
        return name.personalName + "";
    }*/

    public String toString2(){

        if(!name.surname.equals("")) {
            name.surname=name.surname;
        }

        if (name.surname.equals("")  && father != null && !father.name.surname.isEmpty() ){
            name.surname = father.name.surname;
        }

        // Отчество
        if (!name.patronymic.equals("")){
            name.patronymic = name.patronymic + "ович";
        }

        if (name.patronymic.equals("")  && father != null && !father.name.personalName.isEmpty() ){
            name.patronymic = father.name.personalName + "ович";
        }


        return name.personalName + name.surname + name.patronymic;
    }
}
