import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(N));
    }

    static long fibonacci(int N) {
        if(N == 0) return 0;
        if(N == 1 || N == 2) return 1;

        int a = 1;
        int b = 2;
        for (int i = 3; i < N; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}
