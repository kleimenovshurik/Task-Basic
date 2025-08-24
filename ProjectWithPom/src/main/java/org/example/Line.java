package org.example;

public class Line {

        PointCoordinate startCoordinate;
        PointCoordinate endCoordinate;

        // Конструктор из двух точек
        public Line(PointCoordinate startCoordinate, PointCoordinate endCoordinate) {
            this.startCoordinate = startCoordinate;
            this.endCoordinate = endCoordinate;
        }

        // Конструктор из четырех чисел
        public Line(int x1, int y1, int x2, int y2) {
            this.startCoordinate = new PointCoordinate(x1, y1);
            this.endCoordinate = new PointCoordinate(x2, y2);
        }

        @Override
        public String toString() {
            return "Линия от " + startCoordinate.toString() + " до " + endCoordinate.toString();
        }

    /*public int DlinaLine(PointCoordinate startCoordinate,  PointCoordinate endCoordinate){
        double result = 0;
        result = Math.pow(endCoordinate.getX() - startCoordinate.getX(), 2) + Math.pow(endCoordinate.getY() - startCoordinate.getY(), 2);
        result = Math.abs(result);
        return (int) result;
    }*/

        public int dlinaLine(){
            double result = 0;
            result = Math.pow(this.endCoordinate.getX() - this.startCoordinate.getX(), 2) + Math.pow(this.endCoordinate.getY() - this.startCoordinate.getY(), 2);
            result = Math.abs(result);
            return (int) result;
        }
}
