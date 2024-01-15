package step5;

import java.util.Scanner;

public class No27866 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        int num = s.nextInt();
        char[] charArr = word.toCharArray();
        System.out.println(charArr[num-1]);
    }
}
