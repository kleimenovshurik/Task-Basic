package org.example;

import java.util.ArrayList;
import java.util.List;

public class Square {
    private PointCoordinate leftUpConer;
    private int side;
    //поле используемое для возвращения новой Ломаной (из задачи 1.5.7), точки которой соответствуют точкам углов текущего квадрата
    public PolyLine poli;


    public Square(PointCoordinate leftUpConer, int side) {
        this.leftUpConer = leftUpConer;
        this.side = side;
    }


    public Square(int x, int y, int side){
        this.leftUpConer = new PointCoordinate(x, y);
        this.side = side;
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
