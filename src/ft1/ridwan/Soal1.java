package ft1.ridwan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal1 {
    public Scanner user = new Scanner(System.in);
    private int n;
    private int [][] arr;

    public void getN() {
        System.out.print("Masukkan Banyak N Ganjil Yang Ingin Ditampilkan: ");
        this.n = user.nextInt();
    }

    public void isiArray(int n) {
        this.arr = new int[2][n];
        int x = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0) {
                    arr[i][j] = x;
                    x = x + 2;
                } else {
                    x = x - 2;
                    arr[i][j] = x;
                }
            }
        }
    }

    public void cetakArray() {
        Boolean tes = true;
        do {
            getN();
            isiArray(n);
            for (int i = 0; i < 2; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }

            System.out.print("\n\nApakah Anda Ingin Mecoba Kembali (Y/N)?");
            String ulang = user.next().toLowerCase();
            if (ulang.equalsIgnoreCase("Y")) {
                tes = true;
            } else {
                tes = false;
            }

        } while (tes);

        System.out.println("Terima Kasih Telah Menggunakan Jasa Kami");
        user.close();
    }

    public static void main(String[] args) {
        System.out.println("BILANGAN GANJIL");
        Soal1 p = new Soal1();
        p.cetakArray();
    }
}