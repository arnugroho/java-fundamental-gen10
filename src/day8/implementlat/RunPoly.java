package day8.implementlat;

import day8.BangunDatar;

public class RunPoly {
    public static void main(String[] args) {
        Bird bird = new Bird();

        Animal animalBird = new Bird();
        animalBird.isFly();


        Animal animalFish = new Fish();
        animalFish.isFly();



//        Animal animal = new Animal() {
//            @Override
//            public void isFly() {
//
//            }
//
//            @Override
//            public int countLegs() {
//                return 0;
//            }
//        };

//        BangunDatar bangunDatar = new BangunDatar() {
//            @Override
//            public void hitungKeliling(int sisi) {
//
//            }
//        };
    }
}
