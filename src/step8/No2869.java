package step8;

import java.util.Scanner;

public class No2869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int V = scan.nextInt();

        int day = (V-B-1) / (A-B) + 1;

        System.out.println(day);

    }
}
