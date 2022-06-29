package ft1.amsal;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {
    Scanner scanner= new Scanner(System.in);

    public int inputUangAndi(){
        System.out.println("Masukan Jumlah Uang Andi = ");
        int uangAndi = scanner.nextInt();
        return uangAndi;
    }

    public void hargaKacamata(){
        int lokasi=1;
        int lokasi2=1;
        int maksimalKacamata;
        int minimalKacamata;
        int[] hargaKacamata = new int[3];
        for (int i=0; i<3; i++){
            System.out.print("Masukan Harga Kacamata " +i+ " = ");
            hargaKacamata[i] = scanner.nextInt();
        }
        System.out.print(Arrays.toString(hargaKacamata));
        System.out.println();

        maksimalKacamata=hargaKacamata[0];
        for(int j = 0; j < 3; j++) {
            if (hargaKacamata[j] > maksimalKacamata){
                maksimalKacamata = hargaKacamata[j];
                lokasi = j+1;
            }
        }
        System.out.println("Nilai maksimalKacamata =" +maksimalKacamata);

        minimalKacamata=hargaKacamata[0];
        for(int k = 0; k < 3; k++) {
            if (hargaKacamata[k] < minimalKacamata){
                minimalKacamata = hargaKacamata[k];
                lokasi2 = k+1;
            }
        }
        System.out.println("Nilai maksimalKacamata =" +minimalKacamata);
    }


    public void hargaBaju(){
        int lokasi=1;
        int lokasi2=1;
        int maksimalBaju;
        int minimalBaju;
        int[] hargaBaju = new int[3];
        for (int i=0; i<3; i++){
            System.out.print("Masukan Harga Baju " +i+ " = ");
            hargaBaju[i] = scanner.nextInt();
        }
        System.out.print(Arrays.toString(hargaBaju));
        System.out.println();
        maksimalBaju=hargaBaju[0];
        for(int j = 0; j < 3; j++) {
            if (hargaBaju[j] > maksimalBaju){
                maksimalBaju = hargaBaju[j];
                lokasi = j+1;
            }
        }
        System.out.println("Nilai maksimalKacamata =" +maksimalBaju);

        minimalBaju=hargaBaju[0];
        for(int k = 0; k < 3; k++) {
            if (hargaBaju[k] < minimalBaju){
                minimalBaju = hargaBaju[k];
                lokasi2 = k+1;
            }
        }
        System.out.println("Nilai maksimalKacamata =" +minimalBaju);
    }



    public void perhitunganUtama(){
        inputUangAndi();
        hargaKacamata();
        hargaBaju();
    }



    public static void main(String[] args) {
        Soal2 cetak = new Soal2();
        cetak.perhitunganUtama();
    }

}
