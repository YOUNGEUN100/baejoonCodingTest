import java.util.Scanner;

public class No9498 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = 1;

        while (true) {
            number = s.nextInt();
            if (number < 0 || number > 100) {
                System.out.println("시험 점수는 0과 100 사이의 숫자로 입력해주세요.");
            } else {
                break;
            }
        }

        int score = number / 10;

        switch (score) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
