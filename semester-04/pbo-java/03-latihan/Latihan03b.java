public class Latihan03b {
    public static void main(String[] args) {
        int a, hasil;
        a = 14;

        hasil = (a++ > 14) ? 10: 20; // membandingkan (14 > 14) hasilnya false
        System.out.println("Output Satu  : " + hasil); // output hasil = 20, karena false

        // a = 15, setelah dinaikan satu 
        hasil = (a <= 14) ? 30: 40; // membandingkan (15 <= 14) hasilnya false
        System.out.println("Output Dua   : " + hasil); // output hasil = 40, karena false

        hasil = (a>14 && a<45) ? 50: 60; // (true && true) maka hasilnya true
        System.out.println("Output Tiga  : " + hasil); // output hasil = 50, karena true
        // hasil dari operator && akan true jika kondisi keduanya true, selain itu hasilnya akan false

        hasil = (a<14 || a<45) ? 70: 80; // (false || true) maka hasilnya true
        System.out.println("Output Empat : " + hasil); // output hasil = 70, karena true
        // hasil dari operator || akan false jika kondisi keduanya false, selain itu hasilnya akan true 

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