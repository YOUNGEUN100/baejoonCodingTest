package step2;//https://www.acmicpc.net/problem/1330

import java.util.Scanner;

public class No1330 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if ( a < b ) System.out.println("<");
        if ( a > b ) System.out.println(">");
        if ( a == b ) System.out.println("==");
    }
}
