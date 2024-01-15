package step6;

import java.util.Scanner;

public class No10988 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        char[] chars = word.toCharArray();
        int cnt = chars.length;
        boolean check = true;

        for (int i=0; i<cnt/2; i++) {
            if (chars[i] != chars[cnt-1-i]) {
                check = false;
            }
        }

        if (check) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
