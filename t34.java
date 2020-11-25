package exercises;
import java.util.Scanner;
public class t34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.next();

        System.out.println(sort(s));

    }

    public static char[] sort(String s){
        int len = s.length();
        char[] str = s.toCharArray();
        for(int i = 0; i < len; i++){
            int k = i;
            for(int j = i+1; j < len; j++)
                if(str[j] < str[k]) k = j;
            char temp = str[i];
            str[i] = str[k];
            str[k] = temp;
        }

        return str;
    }
}