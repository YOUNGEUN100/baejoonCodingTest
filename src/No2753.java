import java.util.Scanner;

public class No2753 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year;

        while (true) {
            year = s.nextInt();
            if (year < 1 || year > 4000) {
                System.out.println("1과 4000 사이의 숫자를 입력하세요.");
            } else {
                break;
            }
        }

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
