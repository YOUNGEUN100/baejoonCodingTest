package Step4;

import java.util.Scanner;

public class No1546 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        double[] test = new double[cnt];
        double max = 0;
        for (int i=0; i<cnt; i++) {
            test[i] = s.nextInt();
            if (max < test[i]) {
                max  = test[i];
            }
        }
        double sum = 0;
        for (int i=0; i<cnt; i++) {
            test[i] = test[i] / max * 100;
            sum += test[i];
        }
        System.out.println(sum/cnt);
    }
}
