import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long answer = 1;
        for (int i = N; i > 0; i--) {
            answer *= N;
            N -= 1;
        }

        System.out.println(answer);
    }
}
