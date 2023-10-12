//https://www.acmicpc.net/problem/2588

import java.util.Scanner;

public class No2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 1;
        int b = 1;
        while (true) {
            a = s.nextInt();
            if (a >= 100 && a <= 999) {
                break;
            } else {
                System.out.println("세 자리 자연수를 입력하세요.");
            }
        }
        while (true) {
            b = s.nextInt();
            if (b >= 100 && b <= 999) {
                break;
            } else {
                System.out.println("세 자리 자연수를 입력하세요.");
            }
        }

        int d3 = b / 100; // 385 -> 3
        int d2 = (b % 100) / 10; // 385 -> 8
        int d1 = b - d3*100 - d2*10; // 385 -> 5

        System.out.println(a * d1);
        System.out.println(a * d2);
        System.out.println(a * d3);
        System.out.println(a * b);
    }
}
