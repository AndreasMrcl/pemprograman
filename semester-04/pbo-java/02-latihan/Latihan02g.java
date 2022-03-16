public class Latihan02g {
    public static void main(String[] args) {
        double[] myList =  {1.1, 2, 3, 4, 5};
        double sum = 0;

        for (int i = 0; i < myList.length; i++)
        {
            System.out.println(myList[i]);

            sum = sum + myList[i];
        }

        System.out.println("Total : " + sum);
    }
}