package Step6;

import java.util.Scanner;

public class No1316 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int N = scan.nextInt();
        int result = 0;

        for (int i=0; i<N; i++) {
            if (check()) {
                result++;
            }
        }
        System.out.println(result);

    }

    public static boolean check() {
        boolean[] alpha = new boolean[26];
        int prev = 0;
        final int a = 97;
        String word = scan.next();

        for (int i=0; i<word.length(); i++) {

            int now = word.charAt(i);

            if (prev != now) {
                if (!alpha[now - a]) {
                    alpha[now - a] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }


        return true;
    }

}
