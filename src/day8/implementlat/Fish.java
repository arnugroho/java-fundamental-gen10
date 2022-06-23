package day8.implementlat;

public class Fish implements Animal{
    @Override
    public void isFly() {
        System.out.println("Fish Can't Fly");
    }

    @Override
    public int countLegs() {
        return 0;
    }

    public void howToSwim(){

    }
}
