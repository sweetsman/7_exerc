package exercises;
import java.util.Scanner;
public class t31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int n1 = input.nextInt();
        int[] list1 = new int[n1];
        for (int i = 0; i < n1; i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list2: ");
        int n2 = input.nextInt();
        int[] list2 = new int[n2];
        for (int i = 0; i < n2; i++)
            list2[i] = input.nextInt();

        System.out.print("The merged list is ");
        int[] ans = merge(list1, list2);
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
        System.out.println();

        input.close();
    }

    public static int[] merge(int[] list1, int[] list2){
        int i = 0, j = 0, n = 0;
        int[] ans = new int[list1.length + list2.length];
        while(i != list1.length || j != list2.length){
            if(i == list1.length) {
                ans[n] = list2[j];
                j++;
                n++;
                continue;
            }
            if(j == list2.length) {
                ans[n] = list1[i];
                i++;
                n++;
                continue;
            }
            if(list1[i] <= list2[j]){
                ans[n] = list1[i];
                i++;
            }else{
                ans[n] = list2[j];
                j++;
            }
            n++;
        }
        return ans;
    }

}