package Step7;

import java.util.Scanner;

public class No2566 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int row = 0;
        int col = 0;
        int max = 0;

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                arr[i][j] = scan.nextInt();
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((row+1) + " " + (col+1));


    }
}
