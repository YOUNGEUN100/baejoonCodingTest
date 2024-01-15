package step4;

import java.util.Scanner;

public class No10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int x = s.nextInt();
        int[] arr = new int[cnt];
        for (int i=0; i<cnt; i++) {
            arr[i] = s.nextInt();
        }
        for (int i=0; i<cnt; i++) {
            if (x > arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
