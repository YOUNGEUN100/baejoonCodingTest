package step3;

import java.util.Scanner;
public class No10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int[] sum = new int[cnt];
        for (int i=0; i<cnt; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            sum[i] = a + b;
        }
        for (int i=0; i<cnt; i++) {
            System.out.println(sum[i]);
        }
    }
}
