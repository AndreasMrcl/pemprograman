import java.util.Scanner;

public class Latihan04b {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nama;
            int a = 1, anak, gaji, penjualan;
            double bonus, total = 0, terima;

            System.out.println("Hitung Total Penjualan");
            System.out.println("===============================");
            System.out.print("Nama      : ");
            nama = input.nextLine();
            System.out.print("Bulan     : ");
            nama = input.nextLine();
            System.out.println("\nTotal Penjualan");
            while (a < 5)
            {
                System.out.print("Minggu ke-" + a + " : ");
                penjualan = input.nextInt();
                total += penjualan;
                a++;
            }

            if (total > 5000000) {
                bonus = 0.1 * total;
            } else {
                bonus = 0.05 * total;
            }

            terima = total + bonus;

            System.out.println("===============================");
            System.out.println("Total     : " + total);
            System.out.println("Bonus     : " + bonus);
            System.out.println("Terima    : " + terima);
        }
    }
}
