import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long start = 1;
        long end = S;
        long result = 0;

        while (start <= end) {
            long mid = (start + end) / 2;

            long sum = (mid * (mid + 1)) / 2;

            if (sum > S) {
                end = mid - 1;
            } else {
                start = mid + 1;
                result = mid;
            }
        }
        System.out.println(result);

    }
}