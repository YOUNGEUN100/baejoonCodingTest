import java.util.Arrays;
import java.util.Scanner;

public class No2675 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        char[] arr = sentence.toCharArray();
        int space = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == ' ') {
                space++;
            }
        }
        if (arr.length > 0) {
            space++;
        }
        System.out.println(space);
    }
}
