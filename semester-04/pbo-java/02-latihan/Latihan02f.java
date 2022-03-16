public class Latihan02f {
    public static void main(String[] args) {
        // int[] myList = {1.1, 2, 3, 4, 5};
        // jika menggunakan kode diatas akan terjadi error
        // errornya Type mismatch: cannot convert from double to int
        
        // solusinya menggunakan tipe data double
        double[] myList =  {1.1, 2, 3, 4, 5};

        // atau menggunakan kode dibawah ini, output akan menjadi int
        // int[] myList = { (int) 1.1, 2, 3, 4, 5 };

        for (int i = 0; i < myList.length; i++)
        {
            System.out.println(myList[i]);
        }
    }
}
