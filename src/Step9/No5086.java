package Step9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No5086 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> result = new ArrayList<>();

        int first = -1;
        int second = -1;

        while (true) {

            first = scan.nextInt();
            second = scan.nextInt();

            if (first == 0 && second == 0) {
                break;
            }

            if (second % first == 0) {
                result.add("factor");
            } else if (first % second == 0) {
                result.add("multiple");
            } else {
                result.add("neither");
            }
        }

        scan.close();

        for (int i=0; i<result.size(); i++) {
            System.out.println(result.get(i));
        }

    }


}
