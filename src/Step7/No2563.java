package Step7;

import java.util.Scanner;

public class No2563 {

    // 색종이 면접을 1로 표현하고 1의 개수를 센다.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[][] paper = new int[100][100];
        int area = 0;

        for (int i=0; i<cnt; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            for (int a=x; a<x+10; a++) {
                for (int b=y; b<y+10; b++) {
                    paper[a][b] = 1;
                }
            }
        }

        for (int i=0; i<100; i++) {
            for (int j=0; j<100; j++) {
                if (paper[i][j] == 1) {
                    area++;
                }
            }
        }

        System.out.println(area);


    }
}
