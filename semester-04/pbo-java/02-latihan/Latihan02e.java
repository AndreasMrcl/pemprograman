public class Latihan02e {
    public static void main(String[] args) {
        int a, t;
        double luas;

        a = 2; t = 7;

        luas = 0.5 * a * t;
        
        System.out.println("Luas Segitiga : " + luas);
        // Output : Luas Segitiga : 7.0
        
        int luasInt;
        luasInt = (int) luas;

        System.out.println("Luas Segitiga : " + luasInt);
        // Output : Luas Segitiga : 7
    }
}
