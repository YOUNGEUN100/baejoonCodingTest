package Step8;

import java.util.Scanner;

public class No2903 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int side = 2;

        for (int i=0; i<N; i++) {
            side += (side-1);
        }

        System.out.println(side * side);


    }
}
