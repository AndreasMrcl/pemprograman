public class Main02 {
    int a;
    boolean b;
}

class Cobamain {
    public static void main(String[] args) {
        // default constructor dipanggil
        Main02 obj = new Main02();

        System.out.println("Default Value : ");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}