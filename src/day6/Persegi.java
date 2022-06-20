package day6;

public class Persegi {
    public int sisi;

    public Persegi(){
        System.out.println("Ini constructor persegi");
//        System.out.println(sisi);
    }

    public Persegi(int sisi){
        this.sisi = sisi;
//        System.out.println(this.sisi);
    }

    public void cetakSisi(){
        System.out.println(this.sisi);
    }


    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.cetakSisi();

        System.out.println("-------------------");
        Persegi persegi = new Persegi(6);
        persegi.cetakSisi();

    }
}
