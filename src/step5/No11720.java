package step5;

import java.util.Scanner;

public class No11720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        String numbers = s.next();
        char[] chars = numbers.toCharArray();
        int sum = 0;
        for (int i=0; i<cnt; i++) {
            sum += chars[i]-48;
        }
        System.out.println(sum);
    }
}
