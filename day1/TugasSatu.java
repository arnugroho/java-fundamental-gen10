package day1;

import java.util.Arrays;
import java.util.Scanner;

public class TugasSatu {
    public static void main(String[] args) {
        // n = 7
        // 0    1   0   1   0   1   0
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for (int i = 0; i < n ; i++){
            if(i % 2 == 0){
                System.out.printf("%4d", 0);
            } else {
                System.out.printf("%4d", 1);
            }

        }

    }
}
