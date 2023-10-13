import java.util.Scanner;

public class No10813 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            arr[i] = i+1;
        }
        int cnt = s.nextInt();
        for (int i=0; i<cnt; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = 0;
            c = arr[a-1];
            arr[a-1] = arr[b-1];
            arr[b-1] = c;
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
