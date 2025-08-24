package org.example;

public class Handgun {
        private int gunCartridge;

        public Handgun(int gunCartridge) {
            if (gunCartridge < 0){
                throw new IllegalArgumentException("Количество патронов в барабане не может быть отрицательным");
            }
            else {
                this.gunCartridge = gunCartridge;
            }

        }

        public Handgun() {
            this.gunCartridge = 5;
        }

        public void toShoot(){
            if (this.gunCartridge > 0){
                System.out.println("Бах!");
                this.gunCartridge--;
            }
            else {
                System.out.println("Клац");
            }

        }

        public int getGunCartridge() {
            return gunCartridge;
        }

}
