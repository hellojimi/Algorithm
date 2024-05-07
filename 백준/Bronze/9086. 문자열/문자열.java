import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String S = br.readLine();

            if (S.length() < 2) {
                bw.write(S + S + "\n");
                continue;
            }
            bw.write(S.charAt(0));
            bw.write(S.charAt(S.length() - 1) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
