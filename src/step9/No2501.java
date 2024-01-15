package step9;

import java.util.Scanner;

public class No2501 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] arr = new int[N];

        int x = 0;
        for(int i=1; i<=N; i++) {
            if (N % i == 0) {
                arr[x] = i;
                x++;
            }
        }

        System.out.println(arr[K-1]);

    }
}
