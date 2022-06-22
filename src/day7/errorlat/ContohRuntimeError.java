package day7.errorlat;

public class ContohRuntimeError {
    public static void main(String[] args) {

        try {
            int[] arr = new int[5];
            System.out.println("print array ke 7 ");
//            System.out.println(arr[7]);
            throw new Exception("Ada error dimari");
//            System.out.println("Hasil print ");
        }catch (Exception e){
            System.out.println("catch block");
            System.out.println(e);
        }

        System.out.println("latihan Error RunTime");
    }
}
