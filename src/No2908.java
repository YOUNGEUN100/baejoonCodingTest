import java.util.Scanner;

public class No2908 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int x =  (a % 10) * 100 + (a / 10 % 10) * 10 + (a / 100);
        int y =  (b % 10) * 100 + (b / 10 % 10) * 10 + (b / 100);
        System.out.println(Math.max(x, y));
    }
}
