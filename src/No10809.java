import java.util.Arrays;
import java.util.Scanner;

public class No10809 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        char[] wordArr = word.toCharArray();
//        char[] alphabet = new char[26];
//        int letter = 97;
//        for (int i=0; i<alphabet.length; i++) {
//            alphabet[i] = (char) letter++;
//            System.out.println(alphabet[i]);
//        }
        int[] check = new int[26];
        int num = 97; //
        for (int i=0; i<check.length; i++) {
            for (int j=0; j<wordArr.length; j++) {
                char letter = (char) num;
                if ((wordArr[j] == letter) && (check[i] == 0)) {
                    check[i] = j;
                }
                if (wordArr[j] != letter && check[i] == 0){
                    check[i] = -1;
                }
            }
            num++;
        }
        for (int i=0; i<check.length; i++) {
            System.out.print(check[i] + " ");
        }
    }
}
