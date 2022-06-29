package ft1.fani;

import java.util.Arrays;
import java.util.Scanner;

public class SoalCerita {

    public int n = getN();


    public int getN(){
        Scanner s = new Scanner(System.in);
        System.out.println("Masukan N");
        int input = s.nextInt();
        return input;
    }

    public int[] getDataBaju(){
        Scanner s = new Scanner(System.in);
        int[] dataBaju = new int[3];
        System.out.println("Masukan 3 Harga Baju");
        for (int i = 0; i < 3; i++){
            dataBaju[i] = s.nextInt();
        }
        return dataBaju;
    }

    public int[] getDataKacamata(){
        Scanner s = new Scanner(System.in);
        int[] dataKacamata = new int[3];
        System.out.println("Masukan 3 Harga Kacamata");
        for (int i = 0; i < 3; i++){
            dataKacamata[i] = s.nextInt();
        }
        return dataKacamata;
    }

    public int[] progamSum(){
        int[] arrDataBaju = getDataBaju();
        int[] arrDataKacamata = getDataKacamata();
        int[] tampungData = new int[9];
        int counter = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                tampungData[counter] = arrDataBaju[i] + arrDataKacamata[j];
                counter++;
            }
        }
        return tampungData;
    }

    public int[] sortKecilBesar(){
        int[] dataAcak = progamSum();
        for (int i = 0; i < dataAcak.length; i++){
            for(int j=0; j < dataAcak.length; j++){
                if (dataAcak[i] < dataAcak[j]){
                    int tmp = dataAcak[i];
                    dataAcak[i] = dataAcak[j];
                    dataAcak[j] = tmp;
                }
            }
        }
        return dataAcak;
    }

    public int totalBelanjaMax(){
        int[] totalBelanja = sortKecilBesar();
        int hasil = 0;
        for (int i = totalBelanja.length-1; i <=0; i--){
            if(totalBelanja[i] <= n){
                hasil = totalBelanja[i];
                break;
            }
        }
        return hasil;
    }

    public void cetakHasil(){
        int[] arrDataBaju = getDataBaju();
        int[] arrDataKacamata = getDataKacamata();
        int totalBelanjaMax = totalBelanjaMax();

        System.out.print("Uang Saat Ini ");
        System.out.println(n);

        System.out.print("Harga Kacamata ");
        System.out.println(Arrays.toString(arrDataKacamata));

        System.out.print("Harga Baju ");
        System.out.println(Arrays.toString(arrDataBaju));

        System.out.print("Total Max Untuk Belanja ");
        System.out.print(totalBelanjaMax);
    }

    public static void main(String[] args) {
        SoalCerita obj = new SoalCerita();
        obj.cetakHasil();

    }


}
