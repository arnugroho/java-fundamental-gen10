package day8.implementlat;

public class Bird implements Animal {
    @Override
    public void isFly() {
        System.out.println("yes, bird can fly");
    }

    @Override
    public int countLegs() {
        return 2;
    }

    public void howToFly() {

    }
}
