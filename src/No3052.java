import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] rest = new boolean[42];
        for (int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine()) % 42;
            rest[num] = true;
        }
        int cnt = 0;
        for (int i=0; i<42; i++) {
            if (rest[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
