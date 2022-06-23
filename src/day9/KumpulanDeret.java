package day9;

public class KumpulanDeret {
    public static int[] getFibo(int n) {
        int[] arrFibo = new int[n];
        arrFibo[0] = 1;
        arrFibo[1] = 1;
        for (int i = 2; i < n; i++) {
            arrFibo[i] = arrFibo[i - 1] + arrFibo[i - 2];
        }

        return arrFibo;
    }

    public static String[] getFiboString(int n){
        int[] arrFibo = getFibo(n);
        String[] arr = new String[n];

        for (int i = 0; i < n; i++){
            arr[i] = String.valueOf(arrFibo[i]);
        }
        return arr;
    }
}
