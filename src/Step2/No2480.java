package Step2;

import java.util.Scanner;

public class No2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        // 모두 다른 눈
        if (a != b && b != c && c != a) {
            int max = a;
            if (max < b) max = b;
            if (max < c) max = c;
            System.out.println(max * 100);
        }
        // 같은 눈 2개
        if (a == b || b == c || c == a) {
            // 같은 눈 3개
            if (a == b && b == c ) {
                System.out.println(10000 + a * 1000);
            } else {
                int sameNum = 0;
                if (a == b) sameNum = a;
                if (b == c) sameNum = b;
                if (c == a) sameNum = c;
                System.out.println(1000 + sameNum * 100);
            }
        }
    }


}
