package ft1.fajrul;

import java.util.Scanner;

public class Soal1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan nilai N");
    int n = sc.nextInt();
    int awalGanjil = 1;
    int akhirGanjil = n * 2 - 1;
    for (int i = 0; i < n; i++) {
      System.out.printf("%3d", awalGanjil);
      awalGanjil = awalGanjil + 2;
    }

    System.out.println();
    while (akhirGanjil > 0) {
      System.out.printf("%3d", akhirGanjil);
      akhirGanjil = akhirGanjil - 2;
    }
  }
}

