public class DepartmentModified134 {
    String nazvanieOtdela;
    EmployeeModified134 boss;
    EmployeeModified134 [] mas;

    public void toString2(){
        for(int i = 0; i < mas.length; i++){
            System.out.println(mas[i].name + " работает в отеделе " + nazvanieOtdela );
        }
    }


}
