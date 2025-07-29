public class BreakedLine143 {
        PointCoordinate141 [] mas;

        BreakedLine143(){

        };

        BreakedLine143(PointCoordinate141 [] masPC){
            this.mas = masPC;
        }


        public String toString(){
            String str="";
            for(int i = 0; i<mas.length-1; i++){
                str = str + mas[i] + ", ";
            }
            return "Линия [" + str + mas[mas.length-1] + "]";
        }

}
