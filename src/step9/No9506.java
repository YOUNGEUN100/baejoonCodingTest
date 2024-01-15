package step9;

import java.util.ArrayList;
import java.util.Scanner;

public class No9506 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int x = 0;

        while (true) {
            x = scan.nextInt();
            if (x == -1) {
                break;
            }
            numbers.add(x);
        }

        for (int i=0; i<numbers.size(); i++) {
            int num = numbers.get(i);
            int sum = 0;
            ArrayList<Integer> arr = new ArrayList<Integer>();
            System.out.print(num);

            for (int j=1; j<=num/2; j++) {
                if (num % j == 0) {
                    arr.add(j);
                    sum += j;
                }
            }

            if (num == sum) {
                System.out.print(" = ");
                for (int a=0; a<arr.size(); a++) {
                    if (a == arr.size()-1) {
                        System.out.print(arr.get(a));
                    } else {
                        System.out.print(arr.get(a) + " + ");
                    }
                }
            } else {
                System.out.print(" is NOT perfect.");
            }

            System.out.println();
        }

    }



}
