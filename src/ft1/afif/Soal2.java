package ft1.afif;

import java.util.Scanner;

public class Soal2 {
    public int jualBeli() {
        Scanner input = new Scanner(System.in);
        System.out.println("Uang anda :");
        int uang = input.nextInt();
        int[] hargaKacamata = {34, 26, 44};
        int[] hargaBaju = {21, 39, 33};

        int kacamataMin = hargaKacamata[0];
        for (int i = 0; i < hargaKacamata.length;
             i++) {
            if (hargaKacamata[i] < kacamataMin) {
                kacamataMin = hargaKacamata[i];
            }
        }
        int bajuMin = hargaBaju[0];
        for (int i = 0; i < hargaBaju.length; i++) {
            if (hargaBaju[i] < bajuMin) {
                bajuMin = hargaBaju[i];
            }
        }
        int sumMin = bajuMin + kacamataMin;
        if (sumMin >= uang) {
            System.out.println("Dana Tidak Mencukupi");
        } else {
            System.out.println("Hasil = " + sumMin);
        }
        return uang;
    }

    public static void main(String[] args) {
        Soal2 hasil = new Soal2();
        hasil.jualBeli();
    }
}
