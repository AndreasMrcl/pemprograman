public class Latihan03e {
    public static void main(String[] args) {
        int a = 8;
        int b = 20;

        System.out.println("Nilai a    : " + ( a )); // mencetak output a = 8
        System.out.println("Nilai b    : " + ( b )); // mencetak output b = 20
        System.out.println("Hasil a>>1 : " + ( a>>1 )); // mencetak output a>>1 = 4
        // binary(8): 0000 1000
        // digeser ke kanan 1 menjadi 0000 0100 
        // 0000 0100 diubah ke desimal menjadi 4
        System.out.println("Hasil a>>2 : " + ( a>>2 )); // menecetak output a>>2 = 2
        // binary(8): 0000 1000
        // digeser ke kanan 2 menjadi 0000 0010
        // 0000 0010 diubah ke desimal menjadi 2
        System.out.println("Hasil b<<1 : " + ( b<<1 )); // mencetak output b<<1 = 40
        // binary(20): 0001 0100
        // digeser ke kiri 1 menjadi 0010 1000
        // 0010 1000 diubah ke desimal menjadi 40
        System.out.println("Hasil b<<2 : " + ( b<<2 )); // mencetak output b<<2 = 80
        // binary(20): 0001 0100
        // digeser ke kiri 1 menjadi 0101 0000
        // 0101 0000 diubah ke desimal menjadi 80

        System.out.println("\n=======================================");
        System.out.println("Program  : Latihan03a");
        System.out.println("NIM      : A12.2020.06492");
        System.out.println("Nama     : Andreas Marcelino Andriawan");
    }
}

// Output dari program diatas
// Nilai a    : 8
// Nilai b    : 20
// Hasil a>>1 : 4
// Hasil a>>2 : 2
// Hasil b<<1 : 40
// Hasil b<<2 : 80

// =======================================
// Program  : Latihan03a
// NIM      : A12.2020.06492
// Nama     : Andreas Marcelino Andriawan