package step5;

import java.util.Scanner;

public class No9086 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        String[] words = new String[cnt];
        for (int i=0; i<cnt; i++) {
            words[i] = s.next();
        }
        for (int i=0; i<cnt; i++) {
            char[] charArr = words[i].toCharArray();
            System.out.print(charArr[0]);
            System.out.println(charArr[charArr.length-1]);
        }
    }
}
