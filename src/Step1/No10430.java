package Step1;//https://www.acmicpc.net/problem/10430

import java.util.Scanner;

public class No10430 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextInt();
            if (array[i] < 2 || array[i] > 10000) {
                System.out.println("2와 10000 사이의 숫자를 입력하세요");
                array[i] = scan.nextInt();
            }
        }
        int a = array[0];
        int b = array[1];
        int c = array[2];

        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}
