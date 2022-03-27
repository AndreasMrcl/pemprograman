import java.util.Scanner;

public class Latihan04d {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nama, no;
            int pemakaian, biaya = 0;


            System.out.println("Perhitungan Biaya Pemakaian Air");
            System.out.println("===================================");
            System.out.print("Nama           : ");
            nama = input.nextLine();
            System.out.print("No. Pelanggan  : ");
            no = input.nextLine();
            System.out.print("Pemakaian Air  : ");
            pemakaian = input.nextInt();
            
            if (pemakaian <= 10) {
                biaya = pemakaian * 1000;
            } else if (pemakaian > 10 && pemakaian <=20) {
                biaya = (pemakaian - 10) * 2000 + 10000;
            } else if (pemakaian >20) {
                biaya = (pemakaian -20) * 5000 + 30000;
            }

            System.out.print("Biaya Pakai    : " + biaya);
            System.out.println("\n===================================");
        }
    }
}
