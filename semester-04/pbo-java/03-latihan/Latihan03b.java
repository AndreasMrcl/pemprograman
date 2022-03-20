public class Latihan03b {
    public static void main(String[] args) {
        int a, hasil;
        a = 14;
        hasil = (a++ > 14) ? 10: 20;
        System.out.println("Output Satu  : " + hasil);

        hasil = (a <= 14) ? 30: 40;
        System.out.println("Output Dua   : " + hasil);

        hasil = (a>14 && a<45) ? 50: 60;
        System.out.println("Output Tiga  : " + hasil);

        hasil = (a<14 || a<45) ? 70: 80;
        System.out.println("Output Empat : " + hasil);

        System.out.println("\n=======================================");
        System.out.println("Program  : Latihan03a");
        System.out.println("NIM      : A12.2020.06492");
        System.out.println("Nama     : Andreas Marcelino Andriawan");
    }
}

// Output dari program diatas
// Output Satu  : 20
// Output Dua   : 40
// Output Tiga  : 50
// Output Empat : 70

// =======================================
// Program  : Latihan03a
// NIM      : A12.2020.06492
// Nama     : Andreas Marcelino Andriawan