public class Latihan03c {
    public static void main(String[] args) {
        int x = 9;
        int y = 3;
        System.out.println("1. " + (x > 3 && x < 10));
        System.out.println("2. " + (x > 3 && y > 10));
        System.out.println("3. " + (x > 3 || y < 10));
        System.out.println("4. " + (x > 3 || y > 10));
        System.out.println("5. " + (x++ > 9 && y+1 > 4));
        System.out.println("6. " + (x > 9 && y+1 > 4));
        System.out.println("7. " + (x++ > 9 || y+1 == 4));
        System.out.println("8. " + (x > 9 || y+1 == 4));

        System.out.println("\n=======================================");
        System.out.println("Program  : Latihan03a");
        System.out.println("NIM      : A12.2020.06492");
        System.out.println("Nama     : Andreas Marcelino Andriawan");
    }
}

// Output dari program diatas
// 1. true
// 2. false
// 3. true
// 4. true
// 5. false
// 6. false
// 7. true
// 8. true

// =======================================
// Program  : Latihan03a
// NIM      : A12.2020.06492
// Nama     : Andreas Marcelino Andriawan