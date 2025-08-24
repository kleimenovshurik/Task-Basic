package org.example;

public class Human {
        private Name name;
        private int height;
        private Human father;

        private String nameStr;

        //возврат имени
        public String getPersonalName() {
            return this.name.personalName;
        }

        //возврат отчества
        public String getpatronymic() {
            return this.name.personalName;
        }

        // возврат фамилии
        public String getSurname(){
            String surname;
            if(this.name.surname.isEmpty()){
                surname = this.father.name.surname;
            }
            else {
                surname = this.name.surname;
            }
            return surname;
        }

        Human(String nameStr){
            this.nameStr = nameStr;
        }

        Human(Name name){
            this.name = name;
        }

        Human(Human father, String nameStr){
            this.father = father;
            this.nameStr = nameStr;
        }

        Human(Human father, Name name){
            this.father = father;
            this.name = name;
        }

    public void setFather(Human father) {
        this.father = father;
    }
/*public String toString(){
    return name.personalName + "";
}*/

        /*public String toString2(){

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
        }*/

        public String toString3(){
            String str = "";
            if(this.name.surname.equals("")){
                str = this.father.name.surname;
            }
            else
            {
                str = this.name.surname;
            }
            return str;
        }


        public Name getName() {
            return name;
        }

        public String getPatronymic() {
            return this.father.name.personalName;
        }


}
