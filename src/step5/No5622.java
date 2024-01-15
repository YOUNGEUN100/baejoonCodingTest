package step5;

import java.util.Scanner;

public class No5622 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        char[] arr = word.toCharArray();
        int[] numbers = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            int ascii = arr[i];

            switch (ascii) {
                case 65: case 66: case 67:
                    numbers[i] = 2; break;
                case 68: case 69: case 70:
                    numbers[i] = 3; break;
                case 71: case 72: case 73:
                    numbers[i] = 4; break;
                case 74: case 75: case 76:
                    numbers[i] = 5; break;
                case 77: case 78: case 79:
                    numbers[i] = 6; break;
                case 80: case 81: case 82: case 83:
                    numbers[i] = 7; break;
                case 84: case 85: case 86:
                    numbers[i] = 8; break;
                case 87: case 88: case 89: case 90:
                    numbers[i] = 9; break;
            }

        }
        int sum = 0;
        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i] + 1;
        }
        System.out.println(sum);
    }
}
