public class Latihan02i {
    public static void main(String[] args) {
        String string1 = "123";
        String string2 = "ab123";

        int varstr1 = Integer.parseInt(string1);

        System.out.println(varstr1 + 2);
        System.out.println(string1 + varstr1);

        // kode dibawah error
        int varstr2 = Integer.parseInt(string2);
        System.out.println(varstr2);

        // Errornya
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "ab123"
        // at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        // at java.base/java.lang.Integer.parseInt(Integer.java:668)
        // at java.base/java.lang.Integer.parseInt(Integer.java:786)
        // at Latihan02i.main(Latihan02i.java:11)
    }
}
