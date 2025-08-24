package org.example;

public class PointCoordinate {
    private int x;
    private int y;

    public PointCoordinate(int x, int y){
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //изменить элемент
    public PointCoordinate changePointCoordinate(PointCoordinate pointCoordinate, int x, int y){
        pointCoordinate.setX(x);
        pointCoordinate.setY(y);
        return pointCoordinate;
    }

    public String toString(){
        return "{" + x+";" + y + "}";
    }
}
