public class Cities148 {
        String name;
        WaysToCities [] ways;

        public String toString(){
            //String result = "Город: " + name + "\nСвязанные города:\n";
            String result = "";
            for (int i = 0; i < ways.length; i++) {
                WaysToCities way = ways[i];
                if (way.nazvaniePunktaKonechnogo != null) {
                    result += "  " + name + " -> " + way.nazvaniePunktaKonechnogo.name + ": " + way.price + "\n";
                }
            }
            return result;

        }


        public String toString2(){
            //String result = "Город: " + name + "\nСвязанные города:\n";
            String result = "";
            for (int i = 0; i < ways.length; i++) {
                result = result + name + ": " + ways[i].nazvaniePunktaKonechnogo.name + " " + ways[i].price + "\n";
            }
            return result;

        }
}
