package step9;

import java.util.Scanner;

public class No1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 0;

        for (int i=0; i<N; i++) {
            int num = scan.nextInt();
            if (check(num)) {
                cnt++;
            }
        }

        System.out.println(cnt);

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
