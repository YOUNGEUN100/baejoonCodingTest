package step6;

import java.util.Scanner;

public class No3003 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] white = {1,1,2,2,2,8};
        int[] answer = new int[6];

        for (int i=0; i<6; i++) {
            int num = s.nextInt();
            answer[i] = white[i] - num;
        }

        for (int i=0; i<answer.length; i++) {
            System.out.print(answer[i] + " ");
        }

    }
}
