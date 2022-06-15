package day1;

import java.util.Arrays;

public class CharacterSplit {
    public static void main(String[] args) {
//        char namaVariable  = '9';
//        System.out.println(namaVariable);
        String s = " akbar   riyan nugroho ";
        int jumlahKata = 0;
        int jumlahHuruf = 0;
        int counter = 1;
        String[] arrHuruf = s.split("");
        System.out.println("print Arr Huruf : ");
        System.out.println(Arrays.toString(arrHuruf));
        for (int i = 0; i < arrHuruf.length; i++){
            if (arrHuruf[i].equalsIgnoreCase(" ")) {

            } else {
                jumlahHuruf++; // jumlahHuruf = jumlahHuruf + 1;
            }

            if (arrHuruf[i].equalsIgnoreCase("a") || arrHuruf[i].equalsIgnoreCase("i")){
                arrHuruf[i] = Integer.toString(counter++);
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arrHuruf));

        // jumlah kata
        String[] arrKata = s.split(" ");
        for (String value : arrKata) {
            if (value.equalsIgnoreCase("") || value.equalsIgnoreCase(" ")) {

            } else {
                jumlahKata++;
            }

        }
        System.out.println(Arrays.toString(arrKata));
        System.out.println("Panjang ArrKata : " + arrKata.length);
        System.out.println("jumlah kata = " + jumlahKata);
        System.out.println("jumlah Huruf = " + jumlahHuruf);
        System.out.println(Arrays.toString(arrHuruf));
    }
}
