package ft1.fani;

import java.util.Arrays;
import java.util.Scanner;

public class DeretBilangan {

    public int getN(){
        Scanner s = new Scanner(System.in);
        System.out.println("Masukan N");
        int input = s.nextInt();
        s.close();
        return input;
    }

    public int[] deretAngkaGanjil(){
        int n = getN();
        int[] arrDeret = new int[n];
        for (int i = 0; i < n; i++){
            arrDeret[i] = i * 2 + 1;
        }
        return arrDeret;
    }

    public void cetakPola(){
        int [] arrGanjil = deretAngkaGanjil();
        for (int i = 0; i < arrGanjil.length; i++) {
            System.out.printf("%3s", arrGanjil[i]);
        }
        System.out.println();
        for (int i = arrGanjil.length-1; i >= 0; i--) {
            System.out.printf("%3s", arrGanjil[i]);
        }
    }


    public static void main(String[] args) {
        DeretBilangan deretBil = new DeretBilangan();
        deretBil.cetakPola();
    }
}
