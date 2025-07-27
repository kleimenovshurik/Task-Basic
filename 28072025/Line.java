public class Line {
    PointCoordinate startCoordinate;
    PointCoordinate endCoordinate;


    Line(PointCoordinate startCoordinate, PointCoordinate endCoordinate){
        this.startCoordinate = startCoordinate;
        this.endCoordinate = endCoordinate;
    }

    public String toString(){
        return "Линия от {" + startCoordinate.x +" " + startCoordinate.y + "}" +
                " до" + "{" + endCoordinate.x+ " " + endCoordinate.y + "}";
    }
}
