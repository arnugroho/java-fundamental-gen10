package ft1.amsal;

import java.util.Scanner;

public class Soal1 {

    public int getN() {
        System.out.println("Masukan Jangkauan Nilai = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }

    public int[] polaBilangan(int n) {
        int[] arrPola = new int[n];
        for (int i = 0; i < arrPola.length; i++) {
            arrPola[i] = i * 2 + 1;
        }
        return arrPola;
    }

    public void isiKerangka(int[][] arr) {
        int[] arrPola = polaBilangan(arr.length);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0) {
                    arr[i][j] = arrPola[j];
                } else {
                    arr[i][j] = arrPola[arr.length - 1 - j];
                }
            }
        }
    }

    public int[][] kerangka() {
        int n = getN();
        int[][] nilai = new int[n][n];
        isiKerangka(nilai);
        return nilai;
    }

    public void cetakKerangka() {
        int[][] nilai = kerangka();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < nilai.length; j++) {
                System.out.printf("%3s", nilai[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Soal1 cetak = new Soal1();
        cetak.cetakKerangka();
    }

}
