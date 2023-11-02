package Step4;

import java.util.Scanner;

public class No2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i=0; i<arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int max = arr[0];
        int maxNum = 0;
        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxNum = i;
            }
        }
        System.out.println(max);
        System.out.println(maxNum+1);

    }
}
