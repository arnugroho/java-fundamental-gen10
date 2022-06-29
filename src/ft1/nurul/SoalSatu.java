package ft1.nurul;

import java.util.Arrays;
import java.util.Scanner; 
 
public class SoalSatu { 
     
    public Scanner in = new Scanner(System.in); 
    private int n; 
    private int [][] arr; 
 
    public void getN() { 
        System.out.print("Masukkan Nilai N : "); 
        this.n = in.nextInt(); 
    } 
 
    public void isiArray(int n) { 
        this.arr = new int[2][n]; 
        int c = 1; 
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) { 
                if(i == 0) { 
                    arr[i][j] = c; 
                    c = c + 2; 
                } else { 
                    c = c - 2; 
                    arr[i][j] = c;
                } 
            } 
        } 
    } 
 
    public void cetakArray() { 
        //Boolean tes = true; 
        //do { 
        getN(); 
        isiArray(n); 
        for (int i = 0; i < 2; i++) { 
            System.out.println(Arrays.toString(arr[i])); 
        }
    } 
 
    public static void main(String[] args) { 
        SoalSatu hasil = new SoalSatu(); 
        hasil.cetakArray(); 
    } 
}