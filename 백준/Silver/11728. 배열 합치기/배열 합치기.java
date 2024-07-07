import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arrN = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int[] arrM = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
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