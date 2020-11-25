package exercises;

public class t24 {
    public static void main(String[] args) {
        String[] suit = {"Spade", "Heart", "Diamond", "Club"};
        boolean[] check = new boolean[4];

        for (int i = 0; i < 4; i++)
            check[i] = false;

        int count = 0;

        while (!(check[0] && check[1] && check[2] && check[3]))
            count += checkPoker(check, suit);

        System.out.println("Numbers of picks: " + count);
    }

    public static int checkPoker(boolean[] check, String[] suit){
        String[] card = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int[] poker = new int[52];
        for (int i = 0; i < 52; i++)
            poker[i] = i;

        for(int i = poker.length-1; i > 0; i--){
            int j = (int) (Math.random() * (i+1));
            int temp = poker[i];
            poker[i] = poker[j];
            poker[j] = temp;
        }

        int cnt = 0;

        while (true){
            cnt++;
            int n = (int) (Math.random() * 52);
            int color = n % 4, num = n % 13;
            if(!check[color]){
                check[color] = true;
                System.out.printf("%s of %s\n", card[num], suit[color]);
                break;
            }
        }
        return cnt;
    }
}