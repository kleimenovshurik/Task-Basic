package mfti16;

public class NonEmptyNames {
    final private String personalName;
    private String surname;
    private String patronymic;

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersonalName() {
        return personalName;
    }

    public NonEmptyNames(String personalName){
        this.personalName = personalName;
        isNotEmptyNull3();
    }

    public NonEmptyNames(String personalName, String surname){
        this.personalName = personalName;
        this.surname = surname;
        isNotEmptyNull3();
    }

    public NonEmptyNames(String personalName, String surname, String patronymic){
        this.personalName = personalName;
        this.surname = surname;
        this.patronymic = patronymic;
        isNotEmptyNull3();
    }

    public void isNotEmptyNull3(){
        if(( this.personalName != null && !this.personalName.isEmpty() ) || (this.surname != null && !this.surname.isEmpty() ) || ( this.patronymic != null & !this.patronymic.isEmpty()) ){
        }
        else {
            throw new IllegalArgumentException("Как минимум один параметр будет иметь не null значение и не пустую строку");
        }
    }


    public String toString()
    {
        return surname + " " + personalName + " " + patronymic;
    }
}
