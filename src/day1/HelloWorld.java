package day1;

import day3.MethodFunction;
import day3.Segitiga;

public class HelloWorld {


    public static void main(String[] args) {

        System.out.println("Hello World");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }

        MethodFunction f = new MethodFunction();
        f.cetakHello();

        Segitiga s3 = new Segitiga();
        s3.hitungLuas();

    }
}
