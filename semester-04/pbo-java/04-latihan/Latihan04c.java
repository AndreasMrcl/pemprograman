import java.util.Scanner;

public class Latihan04c {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nama, prodi;
            int nilai;

            System.out.println("Data Test");
            System.out.println("==============================");
            System.out.print("Nama          : ");
            nama = input.nextLine();
            System.out.print("Program Studi : ");
            prodi = input.nextLine();
            System.out.print("Nilai         : ");
            nilai = input.nextInt();
            System.out.print("Nilai Huruf   : ");

            if (nilai >= 85) {
                System.out.print("A");
            } else if (nilai >= 70) {
                System.out.print("B");
            } else if (nilai >= 60) {
                System.out.print("C");
            } else if (nilai >= 50) {
                System.out.print("D");
            } else {
                System.out.print("E");
            }

            System.out.println("\n==============================");
        }
    }
}
