package Step6;

import java.util.Scanner;

public class No2941 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        char[] arr = word.toCharArray();
        int len = arr.length;
        int cnt = len;

        for (int i=0; i<len-1; i++) {

            if (arr[i] == 'd') {
                if (i<len-2 && arr[i+1] == 'z' && arr[i+2] == '=') cnt--;
                if (arr[i+1] == '-') cnt--;
            }
            if (arr[i] == 'c') {
                if (arr[i+1] == '=') cnt--;
                if (arr[i+1] == '-') cnt--;
            }
            if (arr[i+1] == 'j') {
                if (arr[i] == 'l') cnt--;
                if (arr[i] == 'n') cnt--;
            }
            if (arr[i+1] == '=') {
                if (arr[i] == 's') cnt--;
                if (arr[i] == 'z') cnt--;
            }
        }

        System.out.println(cnt);


        scan.close();

    }
}
