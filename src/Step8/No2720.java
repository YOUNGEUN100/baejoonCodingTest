package Step8;

import java.util.Scanner;

public class No2720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] money = {25, 10, 5, 1};

        int N = scan.nextInt();
        int[] input = new int[N];

        for (int i=0; i<N; i++) {
            input[i] = scan.nextInt();
        }

        for (int i=0; i<N; i++) {
            int x = input[i];
            for (int k : money) {
                int rest = x / k;
                System.out.print(rest + " ");
                x %= k;
            }
            System.out.println();
        }

    }
}
