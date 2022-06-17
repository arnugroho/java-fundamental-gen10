package day5;

import java.util.Scanner;

public class LogicUler {

    public int getN() {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukka Nilai N");
        int n = s.nextInt();
        return n;
    }

    public void cetakKerangka() {
        int n = getN();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.printf("%3s", "*");
                } else if (i % 4 == 1 && j == n -1) {
                    System.out.printf("%3s","*");
                } else if (i % 4 == 3 && j == 0) {
                    System.out.printf("%3s","*");
                } else {
                    System.out.printf("%3s"," ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LogicUler l = new LogicUler();
        l.cetakKerangka();
    }
}
