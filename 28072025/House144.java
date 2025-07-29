public class House144 {

        final int stageQuantity;

        House144(int stageQuantity){
            this.stageQuantity = stageQuantity;
        }



        public String toString(){
            String ending="этажами";
            if(stageQuantity > 0 && stageQuantity < 100 && stageQuantity !=11){
                switch (stageQuantity % 10){
                    case(1):
                    {
                        ending = "этажом";
                        break;
                    }
                    case (2): {
                        ending = "этажами";
                        break;
                    }
                    case (3): {
                        ending = "этажами";
                        break;
                    }
                    case (4): {
                        ending = "этажами";
                        break;
                    }
                    case (5): {
                        ending = "этажами";
                        break;
                    }
                    case (6): {
                        ending = "этажами";
                        break;
                    }
                    case (7): {
                        ending = "этажами";
                        break;
                    }
                    case (8): {
                        ending = "этажами";
                        break;
                    }
                    case (9): {
                        ending = "этажами";
                        break;
                    }
                    case (0): {
                        ending = "этажами";
                        break;
                    }

                }

            }

            if(stageQuantity > 99 && stageQuantity < 1000){
                switch (stageQuantity  % 100){
                    case (0): {
                        ending = "этажами";
                        break;
                    }
                    case(1):
                    {
                        ending = "этажом";
                        break;
                    }
                    case (2): {
                        ending = "этажами";
                        break;
                    }
                    case (3): {
                        ending = "этажами";
                        break;
                    }
                    case (4): {
                        ending = "этажами";
                        break;
                    }
                    case (5): {
                        ending = "этажами";
                        break;
                    }
                    case (6): {
                        ending = "этажами";
                        break;
                    }
                    case (7): {
                        ending = "этажами";
                        break;
                    }
                    case (8): {
                        ending = "этажами";
                        break;
                    }
                    case (9): {
                        ending = "этажами";
                        break;
                    }
                    case (11): {
                        ending = "этажами";
                        break;
                    }

                }
            }

            return "дом с "  + stageQuantity + " " + ending;
        }

    }


