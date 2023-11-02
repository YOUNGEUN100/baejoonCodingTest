package Step5;

import java.util.Scanner;

public class No1152 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        String[] arr = sentence.trim().split(" ");
        if (arr[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(arr.length);
        }
    }
}
