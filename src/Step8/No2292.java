package Step8;

import java.util.Scanner;

public class No2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int n = 1;
        int x = 6;
        int i = 1;
        int level = 1;

        while (number > n) {
            n = n + (x * i);
            i++;
            level++;
        }

        System.out.println(level);

    }
}
