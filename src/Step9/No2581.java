package Step9;

import java.util.Scanner;

public class No2581 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();

        int min = -1;
        int sum = 0;

        for (int i=M; i<=N; i++) {
            if (check(i)) {
                sum += i;
                if (min < 0) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }

    public static boolean check(int n) {

        boolean result = false;
        int cnt = 0;

        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }

        if (cnt == 2) {
            result = true;
        }

        return result;
    }

}
