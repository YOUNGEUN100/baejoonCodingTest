package Step3;

import java.util.Scanner;

public class No2439 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i=0; i<num; i++) {
            for(int x=num-1; x>i; x--) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
