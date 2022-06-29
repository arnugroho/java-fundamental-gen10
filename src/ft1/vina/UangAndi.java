package ft1.vina;

import java.util.Arrays;
import java.util.Scanner;

public class UangAndi {

    public Scanner sc = new Scanner(System.in);

    public int getN() {
        System.out.println("Masukkan Jumlah Uang Andi : ");
        int n = sc.nextInt();
        return n;
    }

    public int[] kacamata() {
        int n = 3;
        int[] arrK = new int[n];

        for (int i = 0; i < arrK.length; i++) {
            System.out.println("Masukkan Harga Untuk Kacamata " + (i + 1) + " : ");
            arrK[i] = sc.nextInt();
        }

        //System.out.println("List Harga Kacamata adalah : " + Arrays.toString(arrK));
        return arrK;
    }

    public int[] baju() {
        int n = 3;
        int[] arrK = new int[n];

        for (int i = 0; i < arrK.length; i++) {
            System.out.println("Masukkan Harga Untuk Baju " + (i + 1) + " : ");
            arrK[i] = sc.nextInt();
        }

        //System.out.println("List Harga Baju adalah : " + Arrays.toString(arrK));
        return arrK;
    }

    public static int[] add(int[] first, int[] second) {
        int length = first.length < second.length ? first.length : second.length;
        int[] hasil = new int[length];

        for (int i = 0; i < length; i++) {
            hasil[i] = first[i] + second[i];
        }
        return hasil;
    }

    public void pemakaian() {
        int uang = getN();
        int[] arrKaca = kacamata();
        int[] arrBaju = baju();

        System.out.println("Jumlah Uang Andi adalah " + uang);
        System.out.println("List Harga Kacamata adalah : " + Arrays.toString(arrKaca));
        System.out.println("List Harga Baju adalah : " + Arrays.toString(arrBaju));

        int[] sum = add(arrKaca, arrBaju);
        System.out.println("Jumlah Harga Kacamata dan Baju Adalah : " + Arrays.toString(sum));

        int huhu = sum[0];
        int haha = sum[1];
        int hehe = sum[2];


        if (sum[0] > sum[1] && sum[0] > sum[2] && huhu <= uang) {
            System.out.println("Uang yang terpakai adalah : " + huhu);
        } else if (sum[1] > sum[0] && sum[1] > sum[2] && haha <= uang) {
            System.out.println("Uang yang terpakai adalah : " + haha);
        } else if (sum[2] > sum[1] && sum[2] > sum[0] && hehe <= uang) {
            System.out.println("Uang yang terpakai adalah : " + hehe);
        } else {
            System.out.println("Dana Tidak Mencukupi");
        }
    }


    public static void main(String[] args) {
        UangAndi huhuy = new UangAndi();
        huhuy.pemakaian();
    }
}
