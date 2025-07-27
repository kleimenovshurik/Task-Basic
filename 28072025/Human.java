public class Human {
    Names name;
    int height;
    Human father;

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
