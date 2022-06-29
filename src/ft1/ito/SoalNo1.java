package ft1.ito;

import java.util.Scanner;

public class SoalNo1 {
    public int jumlahINput(){
        Scanner variabel = new Scanner(System.in);
        System.out.print("Masukkan jumlah input n: ");
        int n = variabel.nextInt();
        return n;
    }

    public String[] kerangkaArray(){
        int input = jumlahINput();
        String[] array = new String[input];
        isiKerangkaArray(array);
        return array;
    }

    public void isiKerangkaArray(String[] array){
        for(int batas=0; batas<array.length; batas++){
            array[batas]= String.valueOf(batas*2+1);
        }
    }

    public void cetakKerangkaArray(){
        String[]array = kerangkaArray();
        for(int batas=0; batas<array.length; batas++){
            System.out.printf("%3s", array[batas]);
        }
        System.out.println();

        for(int batas= array.length-1; batas>=0; batas--){
            System.out.printf("%3s", array[batas]);
        }
    }


    public static void main(String[] args) {
        SoalNo1 hasil = new SoalNo1();
        hasil.cetakKerangkaArray();
    }


}
