import java.util.Scanner;

//푸는중
public class No5579 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[30];

        for (int i=0; i<28; i++) {
            int num = s.nextInt();
            arr[num-1] = num;
        }

        for (int n : arr) {
            System.out.println(n);
        }

//        for (int i=0; i<30; i++) {
//            if (arr[i] == ' ') {
//                System.out.println(i+1);
//            }
//        }


    }
}
