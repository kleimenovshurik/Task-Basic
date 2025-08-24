package mfti16;

public class House {
    private int stageQuantity;

    public House(int stageQuantity){
        if (stageQuantity <= 0){
            throw new IllegalArgumentException("У дома должен быть минимум один этаж");
        }
        this.stageQuantity = stageQuantity;
    }

    public void setStageQuantity(int stageQuantity) {
        if (stageQuantity <= 0){
            throw new IllegalArgumentException("У дома должен быть минимум один этаж");
        }
        this.stageQuantity = stageQuantity;
    }

    public int getStageQuantity() {
        return stageQuantity;
    }

    public String toString() {
        String ending = "этажами";

        if (stageQuantity > 0 && stageQuantity < 100 && stageQuantity != 11) {
            int lastDigit = stageQuantity % 10;
            if (lastDigit == 1) {
                ending = "этажом";
            } else if (lastDigit >= 2 && lastDigit <= 9) {
                ending = "этажами";
            } else if (lastDigit == 0) {
                ending = "этажами";
            }
        }

        if (stageQuantity > 99 && stageQuantity < 1000) {
            int lastTwoDigits = stageQuantity % 100;
            if (lastTwoDigits == 11 || lastTwoDigits == 12 || lastTwoDigits == 13 || lastTwoDigits == 14) {
                ending = "этажами";
            } else {
                int lastDigit = stageQuantity % 10;
                if (lastDigit == 1) {
                    ending = "этажом";
                } else {
                    ending = "этажами";
                }
            }
        }

        return "дом с " + stageQuantity + " " + ending;
    }
}
