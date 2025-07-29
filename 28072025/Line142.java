public class Line142 {
        PointCoordinate141 startCoordinate;
        PointCoordinate141 endCoordinate;
        int x1;
        int y1;
        int x2;
        int y2;


        Line142(PointCoordinate141 startCoordinate, PointCoordinate141 endCoordinate){
            this.startCoordinate = startCoordinate;
            this.endCoordinate = endCoordinate;
        }

        Line142(int x1, int y1, int x2, int y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public String toString(){
            return "Линия от {" + startCoordinate.x +" " + startCoordinate.y + "}" +
                    " до" + "{" + endCoordinate.x+ " " + endCoordinate.y + "}";
        }

}
