package org.example;
import java.util.List;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class PolyLine {
    // PointCoordinate [] mas;
    private List <PointCoordinate> points;

    PolyLine(){
    };




    public PolyLine(List<PointCoordinate> points) {
        this.points = points;
    }

    public List <PointCoordinate> addPointCoordinate(PointCoordinate pointCoordinates){
        this.points.add(pointCoordinates);
        return this.points;
    }

    public List <PointCoordinate> addPointCoordinate(List <PointCoordinate> pointCoordinates){
        this.points.addAll(pointCoordinates);
        return this.points;
    }

    // количество элементов
    public int dlinaPolyLine(){
        return  this.points.size();
    }

    // длина ломаной
    public int dlinaPolyLine2(){
        double length = 0;
        double distance = 0;
        for(int i = 0; i< this.points.size()-1; i++){

            int x2 = this.points.get(i+1).getX();
            int x1 = this.points.get(i).getX();

            int y2 = this.points.get(i+1).getY();
            int y1 = this.points.get(i).getY();

            distance = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );

            length = length + distance;

        }
        return (int) length;
    }

    // удалить элемент
    public List <PointCoordinate> removePointCoordinate(int index){
        this.points.remove(index);
        return this.points;
    }

    //получить элемент
    public PointCoordinate getPointCoordinate(int index){
        return this.points.get(index);
    }

    public List<PointCoordinate> getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "PolyLine{" +
                "points=" + points +
                '}';
    }

    /*PolyLine(PointCoordinate [] masPC){
        this.mas = masPC;
    }




    public String toString(){
        String str="";
        for(int i = 0; i<mas.length-1; i++){
            str = str + mas[i] + ", ";
        }
        return "Линия [" + str + mas[mas.length-1] + "]";
    }*/
}
