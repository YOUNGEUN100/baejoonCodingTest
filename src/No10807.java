import java.util.Scanner;

public class No10807 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int[] arr = new int[cnt];
        for (int i=0; i<cnt; i++) {
            arr[i] = s.nextInt();
        }
        int num = s.nextInt();
        int result = 0;
        for (int i=0; i<cnt; i++) {
            if (num == arr[i]) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
