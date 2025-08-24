package org.example;

public class Name {

        String personalName = "";
        String surname = "";
        String patronymic = "";

        Name(String personalName){
            this.personalName = personalName;
        }

        /*Name(String personalName, String surname){
            this.personalName = personalName;
            this.surname = surname;
        }*/

        Name(String personalName, String patronymic){
            this.personalName = personalName;
            this.patronymic = patronymic;
         }

        Name(String personalName, String surname, String patronymic){
            this.personalName = personalName;
            this.surname = surname;
            this.patronymic = patronymic;
        }

        public String toString()
        {
            return surname + " " + personalName + " " + patronymic;
        }

}
