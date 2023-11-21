package Step6;

import java.util.Scanner;

public class No2444 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int space = num;   // 예) num = 5
        int star = -1;

        for (int i = 0; i < num; i++) {
            space -= 1;    // 예) 4, 3, 2, 1, 0
            star += 2;  // 예) 1, 3, 5, 7, 9
            printPattern(space, star);
        }
        for (int i = 0; i < num - 1; i++) {
            space += 1; // 예) 1, 2, 3, 4
            star -= 2; // 예) 7, 5, 3, 1
            printPattern(space, star);
        }
    }

    public static void printPattern(int space, int star) {
        printChar(' ', space);
        printChar('*', star);
        System.out.println();
    }

    public static void printChar(char ch, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(ch);
        }
        System.out.print(sb.toString());
    }
}
