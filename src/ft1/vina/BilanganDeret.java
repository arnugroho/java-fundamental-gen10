package ft1.vina;

import java.util.Arrays;
import java.util.Scanner;

public class BilanganDeret {

    public int getN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai N : ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    public int[] deretArr() {
        int n = getN();
        int[] arrI = new int[n];

        for (int i = 0; i < arrI.length; i++) {
            arrI[i] = i * 2 + 1;
        }
        System.out.println("Deretnya Adalah : ");
        System.out.println(Arrays.toString(arrI));
        return arrI;
    }

    public void besarKecil() {
        int[] arrK = deretArr();

        for (int i = 0; i < arrK.length; i++) {
            for (int j = 0; j < arrK.length; j++) {
                if (arrK[i] > arrK[j]) {
                    int hasil = arrK[i];
                    arrK[i] = arrK[j];
                    arrK[j] = hasil;
                }
            }
        }
        System.out.println(Arrays.toString(arrK));

    }

    public static void main(String[] args) {
        BilanganDeret ujian = new BilanganDeret();
        ujian.besarKecil();
    }
}
