package Step8;

import java.util.Scanner;

public class No1193 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int top = 0;
        int bot = 0;

        if (X == 1) {
            System.out.println("1/1");
            return;
        }

        int n = 0;
        int level = 0;
        // 그룹 찾기
        while (level < X) {
            n++;
            level = n * (n+1) / 2;
        }

        int num = X - (n-1) * n/2;

        if (n % 2 == 0) {
            top = num;
            bot = n - num + 1;
        } else {
            top = n- num + 1;
            bot = num;
        }
        System.out.println(top + "/" + bot);


    }
}
