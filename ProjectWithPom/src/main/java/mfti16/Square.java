package mfti16;

import org.example.PointCoordinate;
import org.example.PolyLine;

import java.util.ArrayList;
import java.util.List;

public class Square {
    private PointCoordinate leftUpConer;
    private int side;
    //поле используемое для возвращения новой Ломаной (из задачи 1.5.7), точки которой соответствуют точкам углов текущего квадрата
    public PolyLine poli;


    public Square(PointCoordinate leftUpConer, int side) {
        if (side < 0){
            throw new IllegalArgumentException("Сторона квадрата не может быть отрицательной либо равна 0");
        }
        this.leftUpConer = leftUpConer;
        this.side = side;
    }

    public void setSide(int side) {
        if (side < 0){
            throw new IllegalArgumentException("Сторона квадрата не может быть отрицательной либо равна 0");
        }
        this.side = side;
    }

    public Square(int x, int y, int side){
        if (side < 0){
            throw new IllegalArgumentException("Сторона квадрата не может быть отрицательной либо равна 0");
        }
        this.leftUpConer = new PointCoordinate(x, y);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    //Может быть приведен к строке вида “Квадрат в точке T со стороной N”, где N – длина стороны, а T – результат приведения к строке верхнего левого угла
    public String toString() {
        return "Квадрат в точке " + leftUpConer + " со стороной " + side;
    }

    public PolyLine polyLine(){
        List<PointCoordinate> list = new ArrayList<>();


        PointCoordinate rightUpConer = new PointCoordinate(leftUpConer.getX() + side, leftUpConer.getY());
        PointCoordinate rightDownConer = new PointCoordinate(rightUpConer.getX(), rightUpConer.getY() - side);
        PointCoordinate leftDownConer = new PointCoordinate(leftUpConer.getX(), leftUpConer.getY()- side);

        list.add(leftUpConer);
        list.add(rightUpConer);
        list.add(rightDownConer);
        list.add(leftDownConer);

        return new PolyLine(list);

    }

    public PointCoordinate getLeftUpConer() {
        return leftUpConer;
    }

    public PolyLine returnNewPolyLine() {
        List<PointCoordinate> list = new ArrayList<>();

        PointCoordinate leftUpConer = new PointCoordinate(this.poli.getPointCoordinate(0).getX(), this.poli.getPointCoordinate(0).getY());
        PointCoordinate rightUpConer = new PointCoordinate(this.poli.getPointCoordinate(1).getX(), this.poli.getPointCoordinate(1).getY());
        PointCoordinate rightDownConer = new PointCoordinate(this.poli.getPointCoordinate(2).getX(), this.poli.getPointCoordinate(2).getY());
        PointCoordinate leftDownConer = new PointCoordinate(this.poli.getPointCoordinate(3).getX(), this.poli.getPointCoordinate(3).getY());

        list.add(leftUpConer);
        list.add(rightUpConer);
        list.add(rightDownConer);
        list.add(leftDownConer);

        return new PolyLine(list);

    }
}
