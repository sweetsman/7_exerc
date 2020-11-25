package exercises;
import java.util.Scanner;
public class t5 {
    public static void main(String[] args){
        int[] nums = new int[100];
        System.out.print("Enter ten numbers:");
        Scanner cin = new Scanner(System.in);
        for(int i = 0; i < 10; ++i){
            int n = cin.nextInt();
            ++nums[n];
        }

        System.out.print("The number of distinct number is ");
        int count = 0;
        for(int i = 0; i < 100; ++i)
            if(nums[i] != 0)
                ++count;
        System.out.println(count);

        for(int i = 0; i < 100; ++i){
            if(nums[i] != 0)
                System.out.print(i + " ");
        }

    }
}