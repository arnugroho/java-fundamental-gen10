package ft1.ridwan;

import java.util.Scanner;
import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;

public class Soal2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Berapa uang Andi?");
        int n = s.nextInt();
        int [] eyeGlass = new int[3];
        int [] cloth = new int [2];
        System.out.println("Harga Kacamata adalah");
        for (int i = 0; i < 3; i++) {
            eyeGlass[i] = s.nextInt();
        }

        System.out.println("Harga Baju adalah");
        for (int i = 0; i < 3; i++) {
            cloth[i] = s.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
//                int [] totalHarga = eyeGlass[i] + cloth[i];
//                System.out.printf("%3d", totalHarga[i]);
            }
        }
        
        // turn to array
    }
}
