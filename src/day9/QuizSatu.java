package day9;

import java.util.Scanner;

public class QuizSatu {

    public int getN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nilai N : ");
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }

    public String[][] buatKerangka() {
        int n = getN();
        String[][] arr = new String[n][n];
        if (n % 2 == 0) {
            System.out.println("Nilai N = Harus Ganjil");
        } else {
//            isiKerangka(arr);
            isiKerangkaPola2(arr);
        }
        return arr;
    }

    public void isiKerangka(String[][] arr) {
        String[] arrAngka = KumpulanDeret.getFiboString(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = arrAngka[i];
                } else if (i + j == arr.length - 1) {
                    arr[i][j] = arrAngka[j];
                } else if (i < j && i < arr.length / 2 && i + j < arr.length - 1) {
                    arr[i][j] = "A";
                } else if (i < j && j > arr.length / 2 && i + j > arr.length - 1) {
                    arr[i][j] = "B";
                } else if (i > j && i > arr.length / 2 && i + j > arr.length - 1) {
                    arr[i][j] = "C";
                } else if (i > j && j < arr.length / 2 && i + j < arr.length - 1) {
                    arr[i][j] = "D";
                } else {
                    arr[i][j] = "0";
                }

            }
        }
    }

    public void isiKerangkaPola2(String[][] arr) {
        String[] arrAngka = KumpulanDeret.getFiboString(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i <= j && i <= arr.length / 2 && i + j <= arr.length - 1) {
                    arr[i][j] = arrAngka[i];//String.valueOf(i);
                } else if (i < j && j > arr.length / 2 && i + j > arr.length - 1) {
                    arr[i][j] = arrAngka[arr.length - 1 - j];//String.valueOf(arr.length - 1 - j);
                } else if (i >= j && i > arr.length / 2 && i + j >= arr.length - 1) {
                    arr[i][j] = arrAngka[arr.length - 1 - i];//String.valueOf(arr.length - 1 - i);
                } else if (i > j && j < arr.length / 2 && i + j < arr.length - 1) {
                    arr[i][j] = arrAngka[j];//String.valueOf(j);
                } else {
                    arr[i][j] = "0";
                }

            }
        }
    }

    public void cetakKerangka() {
        String[][] arr = buatKerangka();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%3s", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QuizSatu q = new QuizSatu();
        q.cetakKerangka();

//        String[][] a = new String[4][];
//        a[0] = new String[2];
//        a[1] = new String[3];
//        a[2] = new String[2];
//        a[3] = new String[4];
    }
}
