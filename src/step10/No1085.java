package step10;

import java.util.Scanner;

public class No1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        if (!checkInput(w, 1000)) return;
        if (!checkInput(h, 1000)) return;
        if (!checkInput(x, w-1)) return;
        if (!checkInput(y, h-1)) return;

        int[] num = new int[4];
        num[0] = x;
        num[1] = y;
        num[2] = w-x;
        num[3] = h-y;

        int min = num[0];

        for (int i=1; i<3; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }

        System.out.println(min);
    }

    public static boolean checkInput(int num, int max) {
        if (num >= 1 && num <= max) {
            return true;
        } else {
            return false;
        }
    }

}
