package step8;

import java.util.Scanner;

public class No11005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int B = scan.nextInt();
        char[] result = new char[100];

        int i = 0;

        while (N > 0) {
            int digit = N % B;
            if (digit < 10) {
                digit += '0';
            } else {
                digit += 'A' - 10;
            }

            result[i] = (char)digit;
            N /= B;
            i++;
        }

        for (int x = result.length-1; x>=0; x--) {
            if (result[x] != '\0') {
                System.out.print(result[x]);
            }
        }

    }
}
