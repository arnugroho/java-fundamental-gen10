package ft1.dhafi;

import java.util.Scanner;

public class SoalNo1 {
    public void arrGanjil(){
    Scanner sc = new Scanner(System.in);
    int n;
        System.out.println("Masukan Nilai : ");
        n = sc.nextInt();
        int ganjil = 1;
        int ganjill = n * 2 - 1;
        for (int i = 0; i < n; i++){
            System.out.printf("%3s", ganjil);
            ganjil += 2;
        }
        System.out.println();
        while (ganjill > 0){
            System.out.printf("%3s", ganjill);
            ganjill -= 2;
        }
    }

    public static void main(String[] args) {
        SoalNo1 g = new SoalNo1();
        g.arrGanjil();
    }
}



