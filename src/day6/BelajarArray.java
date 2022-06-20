package day6;


import java.util.Arrays;

public class BelajarArray {
    public static void main(String[] args) {
        // tipe data sama
        //
        String[] arrs = new String[5];
        System.out.println(arrs.length);
        System.out.println(Arrays.toString(arrs));
        arrs[0] = "akbar";
        String nama = arrs[0];
        System.out.println("'nama : " + nama);

        for (int i = 0 ; i < arrs.length; i++){
            arrs[i] = String.valueOf(i);
        }

        for (int i = 0 ; i < arrs.length; i++){
            System.out.println(arrs[i]);
        }


        // user memasukkan nilai n
        // semisal nilai n = 3
        // , maka user memasukkan tiga buah angka
        // angka 1 : 23
        // angka ke 2 : 12
        // angka 3 : 40

        // outputnya :
        // adalah bilangan terurut
        // 1. dari kecil ke besar
        // : 12 23 40
        // 2. dari besar ke kecil
        // : 40 23 12

        // syarat pengerjaan
        // 1. jangan pakai method sort
        // 2. gunakan array untuk menampung angka sebanyak n
        // 3. gunakan array untuk menampung hasil sorting


    }
}
