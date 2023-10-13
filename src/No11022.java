import java.util.Scanner;

public class No11022 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] sum = new int[T];
        String[] cases = new String[T];
        for (int i=0; i<T; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            sum[i] = a + b;
            cases[i] = "Case #" + (i+1) + ": " + a + " + " + b + " = " + sum[i];
        }
        for (int i=0; i<T; i++) {
            System.out.println(cases[i]);
        }
        s.close();
    }
}
