package day1;

import java.util.Scanner;

public class CetakGenap {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Nilai n : ");
        // variable = empat menampung nilai
        int n = scan.nextInt();

        scan.close();

        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i * 2);
        }
    }
}
