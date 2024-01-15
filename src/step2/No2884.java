package step2;

import java.util.Scanner;

public class No2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h; int m;
        while (true) {
            h = s.nextInt();
            if (h < 0 || h > 23) {
                System.out.println("0부터 23 사이의 숫자를 입력하세요");
                h = s.nextInt();
            } else break;
        }
        while (true) {
            m = s.nextInt();
            if (m < 0 || m > 59) {
                System.out.println("0부터 59 사이의 숫자를 입력하세요");
                m = s.nextInt();
            } else break;
        }

        if (m >= 45) {
            System.out.println(h + " " + (m-45));
        } else {
            if ( h >= 1) {
                System.out.println((h-1) + " " + (m+60-45));
            } else {
                System.out.println((24-1) + " " + (m+60-45));
            }

        }

    }
}
