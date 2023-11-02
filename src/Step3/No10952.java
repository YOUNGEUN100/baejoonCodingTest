package Step3;

import java.util.ArrayList;
import java.util.Scanner;

public class No10952 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int a = s.nextInt();
            int b = s.nextInt();
            if (a==0 && b==0) break;
            list.add(a+b);
        }
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
