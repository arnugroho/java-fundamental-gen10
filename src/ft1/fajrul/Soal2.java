package ft1.fajrul;

import java.util.Scanner;

public class Soal2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan uang Andi");
    int n = sc.nextInt();
    int[] kacamata = new int[3];
    int[] baju = new int[3];
    System.out.println("Masukkan harga kacamata");
    for (int i = 0; i < 3; i++) {
      kacamata[i] = sc.nextInt();
    }
    System.out.println("Masukkan harga baju");
    for (int i = 0; i < 3; i++) {
      baju[i] = sc.nextInt();
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.printf("%3d", kacamata[i] + baju[j]);
      }
    }// jadikan dalam 1 array, lalu sortir
  }
}


