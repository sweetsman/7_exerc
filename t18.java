package exercises;
import java.util.Scanner;
public class t18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] num = new double[10];

        System.out.print("Please enter ten numbers: ");
        for (int i = 0; i < num.length; i++)
            num[i] = input.nextDouble();

        bubbleSort(num);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length - 1) System.out.print("   ");
        }
        System.out.println();

        input.close();
    }

    public static void bubbleSort(double[] array) {
        double temp;

        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}
