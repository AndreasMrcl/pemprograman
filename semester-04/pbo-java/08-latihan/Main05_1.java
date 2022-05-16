public class Main05_1 {
    String nama;

    Main05_1() {
    }

    Main05_1(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

class CobaMobil {
    public static void main(String[] args) {
        Main05_1 mobilx = new Main05_1();
        Main05_1 mobilLCGC = new Main05_1("Agya");
        System.out.println("Mobil LCGC    : " + mobilLCGC.nama);
        mobilx.setNama("Wuling");
        System.out.println("Mobil         : " + mobilx.nama);
    }
}
