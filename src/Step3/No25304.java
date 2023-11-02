package Step3;

import java.util.Scanner;

public class No25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int billSum = s.nextInt();
        int cnt = s.nextInt();
        int[] thing = new int[cnt];
        int sum = 0;
        for (int i=0; i<cnt; i++) {
            int price = s.nextInt();
            int num = s.nextInt();
            thing[i] = price * num;
            sum += thing[i];
        }
        if (billSum == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
