import java.util.Scanner;

public class No11021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] sum = new int[T];
        for (int i=0; i<T; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            sum[i] = a + b;
        }
        for (int i=0; i<T; i++) {
            System.out.println("Case #" + (i+1) + ": " + sum[i]);
        }
        s.close();
    }
}
