package Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean arr[] = new boolean[30];
        int n = 28;
        while (n-- > 0) {
            arr[Integer.parseInt(br.readLine())-1] = true;
        }
        for (int i=0; i<30; i++) {
            if(!arr[i]) {
                System.out.println(i + 1);
            }
        }

    }
}
