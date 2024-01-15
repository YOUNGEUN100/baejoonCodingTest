package step7;

import java.util.Scanner;

public class No2738 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int row = getValidInput();
        int col = getValidInput();

        int[][] arr1 = input(row, col);
        int[][] arr2 = input(row, col);
        int[][] sum = new int[row][col];

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getValidInput() {
        int input = scan.nextInt();
        while (input > 100) {
            System.out.println("값이 100 이하여야 합니다. 다시 입력하세요.");
            input = scan.nextInt();
        }
        return input;
    }

    public static int[][] input(int row, int col) {

        int[][] arr = new int[row][col];

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                int inputNum = scan.nextInt();
                if (Math.abs(inputNum) <= 100) {
                    arr[i][j] = inputNum;
                } else {
                    System.out.println("행렬의 원소는 절대값이 100보다 작아야 합니다. 다시 입력해주세요.");
                    j--;
                }
            }
        }
        return arr;
    }

}
