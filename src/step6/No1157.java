package step6;

import java.util.Scanner;

public class No1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputWord = scan.next().toUpperCase(); // 입력한 단어를 대문자로 바꿈
        char[] chars = inputWord.toCharArray(); // char 배열로 단어를 쪼갬
        int[] arr = new int[26]; // A 65 - Z 90

        for (int i=0; i<chars.length; i++) {
            int asciiNum = chars[i]; // 영어대문자 -> 아스키 넘버
            arr[asciiNum-65] += 1;
        }

        int max = -1;
        int result = -1;

        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                result = i;
            } else if (max > 0 && max == arr[i]) {
                result = -1;
            }
        }

        if (result == -1 ) {
            System.out.println("?");
        } else {
            char alpa = (char) ((char) result+65);  // 아스키 넘버 -> 영어대문자
            System.out.println(alpa);
        }


    }
}
