import java.util.Scanner;

public class Latihan04a {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nama;
            int anak, gaji, tanak, total;

            System.out.println("Hitung Tunj. anak");
            System.out.println("=============================\n");

            System.out.print("Nama       : ");
            nama = input.next();
            System.out.print("Anak       : ");
            anak = input.nextInt();
            System.out.print("Gaji       : ");
            gaji = input.nextInt();
            
            if (anak > 3) {
                tanak = 3 * 200000;
            } else {
                tanak = anak * 200000;
            }
            total = gaji + tanak;

            System.out.println("\nHitung Tunj. anak");
            System.out.println("=============================\n");
            System.out.println("Nama       : " + nama);
            System.out.println("Anak       : " + anak);
            System.out.println("Gaji       : " + gaji);
            System.out.println("Tunj Anak  : " + tanak);
            System.out.println("Total      : " + total);
            
        }
        
    }
}
