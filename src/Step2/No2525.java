package Step2;//오류 : 24시간이 넘어가는 것을 생각하지 못했음

import java.util.Scanner;

public class No2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h, m, t; // 시, 분, 타이머

        while (true) {
            h = getInput("시 (0부터 23 사이의 숫자를 입력하세요): ",23);
            m = getInput("분 (0부터 59 사이의 숫자를 입력하세요): ",59);
            t = getInput("타이머 (0부터 1000 사이의 숫자를 입력하세요): ",1000);

            if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && t >= 0 && t <= 1000) {
                break;
            }
        }

        // 타이머 시, 분으로 나누기
        int th = t / 60;
        int tm = t % 60;

        int rh = (h + th) % 24;
        int rm = m + tm;

        if (rm >= 60) {
            rh = (rh + 1) % 24;
            rm -= 60;
        }

        System.out.println(rh + " " + rm);

    }

    // 입력 유효성 검사 및 값 반환
    private static int getInput(String prompt, int max) {
        Scanner s = new Scanner(System.in);
        final int min = 0;
        int value;
        while (true) {
            System.out.print(prompt);
            value = s.nextInt();
            if (value >= min && value <= max) {
                return value;
            } else {
                System.out.println("범위를 벗어난 값입니다. 다시 입력하세요.");
            }
        }
    }
}
