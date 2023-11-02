package Step1;//https://www.acmicpc.net/problem/11382
//런타임 에러 - 10의 12 제곱까지 입력범위인데, nextInt 로 입력받았음. nextLong 으로 입력해야 함.

import java.util.Scanner;

public class No11382 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Long[] num = new Long[3];
        Long sum = 0L;
        for (int i=0; i<3; i++) {
            num[i] = s.nextLong();
            if (num[i] < 1 || num[i] > Math.pow(10,12)) {
                System.out.println("숫자를 다시 입력하세요");
                num[i] = s.nextLong();
            }
            sum += num[i];
        }
        System.out.println(sum);

    }
}
