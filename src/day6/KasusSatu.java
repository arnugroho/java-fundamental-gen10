package day6;

public class KasusSatu {
    public int n = 7;
    public int k = 8;

    public int kembalianAngka(){
        int k = 7;
//        int n = 9;

        System.out.println("cek angka");
        getN();
        cetakK();
        return n;
    }

    public void cetakK(){
//        int k = 6;
        System.out.println(this.n);
    }

    public void getN(){
        this.n = 0;
//        return 0;
    }

    public static void main(String[] args) {
        KasusSatu kasusSatu = new KasusSatu();
        kasusSatu.cetakK();

    }
}
