package day1;

import day3.MethodFunction;

import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {

        System.out.println("Hello World");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }

        MethodFunction f = new MethodFunction();
        f.cetakHello();

        Scanner s = new Scanner(System.in);
    }
}
