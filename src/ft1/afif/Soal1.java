package ft1.afif;

import java.util.Scanner;

public class Soal1 {
    public void arrayGanjil() {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Nilai :");
        n = input.nextInt();
        int ganjildepan = 1;
        int ganjilbelakang = n * 2 - 1;
        for (int i = 0; i < n; i++) {
            System.out.printf("%3s", ganjildepan);
            ganjildepan += 2;
        }
        System.out.println();
        while (ganjilbelakang > 0) {
            System.out.printf("%3s", ganjilbelakang);
            ganjilbelakang -= 2;
        }

    }

    public static void main(String[] args) {
        Soal1 hasil = new Soal1();
        hasil.arrayGanjil();

    }
}
