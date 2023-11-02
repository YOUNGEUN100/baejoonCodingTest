package Step4;

import java.util.Scanner;

public class No10818 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int[] arr = new int[cnt];
        for (int i=0; i<cnt; i++) {
            arr[i] = s.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i=0; i<cnt; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.print(min + " ");
        System.out.print(max);

    }
}
