import java.util.Arrays;
import java.util.Scanner;

public class No10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(s.indexOf(c) + " ");
        }
    }
}
