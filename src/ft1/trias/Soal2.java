package ft1.trias;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Soal2 sl = new Soal2();
        sl.pake();
    }

    public int getN(){
        System.out.print("masukkan Uang Andi = ");
        int n = sc.nextInt();
        return n;
    }

    public int[] cetakKacamata(){
        int n = 3;
        int[] jumlah = new int[n];
        for (int i =0; i<jumlah.length; i++){
            System.out.print("Masukkan Jumlah Kacamata = " + (i + 1) + " : ");
            jumlah[i] = sc.nextInt();
        }

    return jumlah;
    }

    public int[] cetakBaju(){
        int n = 3;
        int[] baju = new int[n];
        for (int i =0; i<baju.length; i++){
            System.out.print("Masukkan Jumlah Baju = " + (i + 1) + " : ");
            baju[i] = sc.nextInt();
        }

        return baju;
    }
    public int[] hasil(){
        int n = 67;
        int[] hasill = new int[n];
        for (int i =0; i<hasill.length; i++){
            hasill[i] = i+n;
        }
        return hasill;
    }

    public void pake(){
    int duit = getN();
    int[] baju = cetakBaju();
    int[] kacamata = cetakKacamata();
    int[] hasill = hasil();
        System.out.println("Jumlah uang andi = " + duit);
        System.out.println("Harga Kacamata = " + Arrays.toString(kacamata));
        System.out.println("Harga Baju = " + Arrays.toString(baju));
        System.out.println("Harga Baju = " + Arrays.toString(hasill));
    }

}
