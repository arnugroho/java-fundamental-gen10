package ft1.trias;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Soal1 sl = new Soal1();
        sl.bilangan();
    }
    public int getN(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka = ");
        int n = sc.nextInt();
        return n;
    }

    public int cetak(){
        int n = getN();
        int i;
        int j = 1;
        int b = n*2-1;
        for (i = 0; i < n; i++) {
            System.out.printf("%3s", j);
            j +=2;
        }
        System.out.println();
        while (b > 0){
            System.out.printf("%3s", b);
            b -=2;
        }
        return n;
    }
    public void bilangan(){
        cetak();
    }
}
