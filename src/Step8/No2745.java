package Step8;

import java.util.Scanner;

public class No2745 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String N = scan.next();
        char[] charN = N.toCharArray();

        int B = scan.nextInt();
        while (B < 2 || B > 36) {
            System.out.println("2 와 36 사이의 숫자를 입력하세요.");
            B = scan.nextInt();
        }

        int sum = 0;
        int power = 1;

        for (int i=charN.length-1; i >= 0; i--) {
            int x = charN[i];
            int digit = 0;

            if (x>='0' && x<='9') {
                digit = x-'0';
            } else if (x>='A' && x<='Z') {
                digit = x-'A'+10;
            }

            sum += digit * power;
            power *= B;
        }

        System.out.println(sum);

    }
}
