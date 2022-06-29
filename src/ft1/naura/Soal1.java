package ft1.naura;

import java.util.Arrays;
import java.util.Scanner;

public class Soal1 {
    public int getN() {
        Scanner s = new Scanner(System.in);
        System.out.print("masukka nilai n: ");
        int n = s.nextInt();
        return n;
    }

    public void cetakGanjil() {
        int n = getN();

        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i * 2 + 1);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i * 2 + 1);
        }
    }
}
