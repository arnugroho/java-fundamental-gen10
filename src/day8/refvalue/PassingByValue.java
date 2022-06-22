package day8.refvalue;

public class PassingByValue {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println(a);
        // 10
        System.out.println(b);
        // 10

        a = a - 3;
        System.out.println(a);
        // 7
        System.out.println(b);
        // 10
    }
}
