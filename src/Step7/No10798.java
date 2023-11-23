package Step7;

import java.util.Scanner;

public class No10798 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char[][] arr = new char[5][15];

        for (int i=0; i<5; i++) {
            String input = scan.next();
            char[] chars = input.toCharArray();

            for (int j=0; j<chars.length; j++) {
                arr[i][j] = chars[j];
            }
        }

        for (int i=0; i<15; i++) {
            for (int j=0; j<5; j++ ) {
                if (arr[j][i] != '\0') {
                    System.out.print(arr[j][i]);
                }
            }
        }

    }
}
