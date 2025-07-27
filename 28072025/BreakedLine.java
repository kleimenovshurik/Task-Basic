public class BreakedLine {
    PointCoordinate [] mas;

    public String toString(){
        String str="";
        for(int i = 0; i<mas.length-1; i++){
            str = str + mas[i] + ", ";
        }
        return "Линия [" + str + mas[mas.length-1] + "]";
    }
}
