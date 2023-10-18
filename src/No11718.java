import java.io.*;

public class No11718 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
