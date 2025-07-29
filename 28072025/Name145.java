public class Name145 {
    String personalName = "";
    String surname = "";
    String patronymic = "";

    Name145(String personalName){
        this.personalName = personalName;
    }

    Name145(String personalName, String surname){
        this.personalName = personalName;
        this.surname = surname;
    }

    Name145(String personalName, String surname, String patronymic){

    }

    public String toString()
    {
        return surname + " " + personalName + " " + patronymic;
    }
}
