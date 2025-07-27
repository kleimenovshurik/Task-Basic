public class PointCoordinate {
    int x;
    int y;

    PointCoordinate(int x,int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "{" + x+";" + y + "}";
    }
}
