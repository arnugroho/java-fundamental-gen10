package day8.refvalue;

public class PassingByRef {

    public void contoh(){
        User user = new User();
        contohRef(user);
        System.out.println(user.a);
    }

    public void contohRef(User person){
        person.a = 9;
    }

    public static void main(String[] args) {
        User bil = new User();
        System.out.println(bil.a);
        bil.a = 4;
        System.out.println(bil.a);

        User bil2 = bil;
        User bilbaru = bil2;
        bil2.a = 9;
        System.out.println("----------------");

        System.out.println(bil.a);
        System.out.println(bil2.a);


        System.out.println("-------------------");
        PassingByRef ps = new PassingByRef();
        ps.contoh();
    }
}
