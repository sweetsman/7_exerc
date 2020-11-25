package exercises;
import java.util.Scanner;
public class t3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter tne integers between 1 and 100: ");

        int number=input.nextInt();
        int[] counts=new int[102];
        int i=1;
        while(number!=0) {
            if(number>=1 && number<=100) {
                counts[number]++;
            }
            number=input.nextInt();
        }

        for(int j=1; j<=100; j++) {
            if(counts[j]>0) {
                System.out.println(j+" occurs "+counts[j]+(counts[j]>1 ? " times." :" time."));
            }
        }

        input.close();
    }
}
