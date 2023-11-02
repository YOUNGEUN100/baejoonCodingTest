package Step4;

import java.util.Arrays;
import java.util.Scanner;

public class No10811 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int range = s.nextInt();
        int[] arr = new int[range];
        for (int i=0; i<range; i++) {
            arr[i] = i + 1;
        }
        int cnt = s.nextInt();
        for (int i=0; i<cnt; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int n = (b - a + 1) / 2;
            for (int j=0; j<n; j++) {
                int temp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = temp;
                a++; b--;
            }
        }
        for (int i=0; i<range; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
