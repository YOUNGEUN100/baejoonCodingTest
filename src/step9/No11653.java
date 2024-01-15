package step9;

import java.util.Scanner;

public class No11653 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int i = 2;
        while (N != 1) {
            if (N % i == 0) {
                System.out.println(i);
                N /= i;
            } else {
                i++;
            }
        }

    }
}
