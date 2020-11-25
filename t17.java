package exercises;
import java.util.Scanner;
public class t17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        String[] name = new String[n];
        double[] score = new double[n];

        System.out.println("Please enter the name and score of the students:");
        for(int i = 0; i < n; i++) {
            name[i] = input.next();
            score[i] = input.nextDouble();
        }
        scoreSort(name, score);

        System.out.println("name\t score\t");
        System.out.println("----------------");
        for(int i = 0; i < n; i++)
            System.out.printf("%-9s%-5.1f\n",name[i],score[i]);

        input.close();
    }

    public static void scoreSort(String[] name, double[] score) {
        String tempName;
        double tempScore;
        int k;
        for(int i = 0; i < score.length-1; i++) {
            k = i;
            for(int j = i+1; j < score.length; j++)
                if(score[j] > score[k])
                    k = j;
            tempName = name[k]; name[k] = name[i]; name[i] = tempName;
            tempScore = score[k]; score[k] = score[i]; score[i] = tempScore;
        }
    }
}
