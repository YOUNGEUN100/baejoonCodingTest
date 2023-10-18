import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2675 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int num = 0;
        String word = "";
        while (cnt > 0) {
            String[] input = br.readLine().split(" ");
            num = Integer.parseInt(input[0]);
            word = input[1];

            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < num; j++) {
                    bw.write(word.charAt(i));
                }
            }
            bw.newLine();
            cnt--;
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
