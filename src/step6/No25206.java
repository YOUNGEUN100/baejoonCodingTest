package step6;

import java.util.Scanner;

public class No25206 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        double majorSum = 0.0;
        double sum = 0.0;

        for (int i=0; i<20; i++) {
            String input = scan.nextLine(); // 'next' vs 'nextLine' 개행문자를 무시하냐 안하냐의 차이
            String[] stChange = input.split(" ");
            double myScore = Double.parseDouble(stChange[1]);
            double grade = alphaToNum(stChange[2]);
            if (grade != -1) {
                majorSum += (grade * myScore);
                sum += myScore;
            }
        }

        System.out.println(majorSum / sum);

    }

    public static double alphaToNum(String alpha) {

        double score = 0.0;

        if (alpha.charAt(0) == 'P') score = -1;
        if (alpha.charAt(0) == 'A') score = 4.0;
        if (alpha.charAt(0) == 'B') score = 3.0;
        if (alpha.charAt(0) == 'C') score = 2.0;
        if (alpha.charAt(0) == 'D') score = 1.0;

        if (alpha.length() > 1) {
            if (alpha.charAt(1) == '+') score += 0.5;
        }
        return score;
    }

}
