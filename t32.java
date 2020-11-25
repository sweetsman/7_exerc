package exercises;
import java.util.Scanner;
public class t32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int num = input.nextInt();
        int[] list = new int[num];

        for(int i = 0; i < num; i++)
            list[i] = input.nextInt();

        partition(list);

        System.out.print("After the partition. the list is ");
        for (int i = 0; i < num; i++)
            System.out.print(list[i] + " ");
        System.out.println();

        input.close();
    }

    public static int partition(int[] list){
        int index = 0, large = 0;
        for(int i = 1; i < list.length; i++){
            if(list[i] < list[index]){
                int temp = list[i];
                list[i] = list[index];
                list[index] = temp;
                index = i;
            }else{
                if(large + index >= list.length)
                    break;
                int temp = list[i];
                list[i] = list[list.length - large - 1];
                list[list.length - large - 1] = temp;
                large++;
                i--;
            }
        }
        return index;
    }
}