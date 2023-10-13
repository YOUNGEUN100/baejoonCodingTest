import java.util.Scanner;

public class No10810 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        int cnt = s.nextInt();
        for (int i=0; i<cnt; i++) {
            int start = s.nextInt();
            int end = s.nextInt();
            int num = s.nextInt();
            for (int j=start-1; j<end; j++) {
                arr[j] = num;
            }
        }
        for (int i=0; i<size; i++) {
            System.out.println(arr[i]);
        }
    }
}
