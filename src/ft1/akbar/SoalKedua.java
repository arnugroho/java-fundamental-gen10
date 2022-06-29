package ft1.akbar;
import java.util.Scanner;

public class SoalKedua {
    Scanner input = new Scanner(System.in);
    public int [][] arr;

    public int uangAndi(){
        System.out.println("Andi ingin membeli sepasang kacamata dan baju");
        System.out.print("Andi mempunyai uang sebanyak ");
        int uangA = input.nextInt();
        return uangA;
    }
    public int [][] listBarang() {
        int[][] hargaBarang = {{34, 26, 44}, {21, 39, 33}};
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.print("\nList harga kacamata :");
                for (int j = 0; j < 3; j++) {
                    System.out.print(hargaBarang[i][j] + " ");
                }
                System.out.println();
            } else if (i == 1) {
                System.out.print("List harga baju : ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(hargaBarang[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
        return hargaBarang;
    }
    public void keranjangKuning() {
        int uang = uangAndi();
        int[][] hargaBarang = listBarang();
        int[] mungkin = new int[10];
        int m = 0;
        int kK;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                kK = hargaBarang[0][i] + hargaBarang[1][j];
                if (kK <= uang) {
                    mungkin[m] = kK;
                    m++;
                    System.out.println( kK + " Akan mendapatkan :"+" kacamata dengan harga "+ hargaBarang[0][i]+" ,dan baju dengan harga  "+hargaBarang[1][j]);
                } else {
                    mungkin[m] = 0;
                    m++;
                    System.out.println( kK + "Mohon maaf uang anda kurang, silahkan cari cuan lagi");
                }
                System.out.println();
            }
        }
        int beli = 0;
        for (int duit : mungkin) {
            if (duit > beli) {
                beli = duit;
            }
        }
        System.out.println("\nPengeluaran maksimal adalah " + beli);
    }

    public static void main(String[] args) {
        SoalKedua run = new SoalKedua();
        run.keranjangKuning();
    }

}
