import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        int[] arrN = new int[N];
        arr = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(arr[i]);
        }

        int[] arrM = new int[M];
        arr = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            arrM[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(arrN);
        Arrays.sort(arrM);

        int p1 = 0;
        int p2 = 0;

        while (p1 < N && p2 < M) {
            if (arrN[p1] <= arrM[p2]) {
                sb.append(arrN[p1]).append(" ");
                p1++;
            } else {
                sb.append(arrM[p2]).append(" ");
                p2++;
            }

            if (p1 == N) {
                for (int i = p2; i < M; i++) {
                    sb.append(arrM[i]).append(" ");
                }
            }

            if (p2 == M) {
                for (int i = p1; i < N; i++) {
                    sb.append(arrN[i]).append(" ");
                }
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}