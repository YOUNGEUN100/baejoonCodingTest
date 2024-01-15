package step3;

import java.util.Scanner;

public class No25314 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i=0; i<num/4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
