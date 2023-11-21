package Step13;

import java.util.Scanner;

public class No2750 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int[] numbers = new int[cnt];

        for (int i=0; i<cnt; i++) {
            numbers[i] = scan.nextInt();
        }

        bubbleSort(numbers);

        for (int i=0; i<cnt; i++) {
            System.out.println(numbers[i]);
        }

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


}
