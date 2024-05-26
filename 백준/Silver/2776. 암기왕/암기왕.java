import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            Set<Integer> note1 = new HashSet<>();
            for (int j = 0; j < N; j++) {
                note1.add(Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                if (note1.contains(Integer.parseInt(st.nextToken()))) {
                    out.append(1).append("\n");
                } else {
                    out.append(0).append("\n");
                }
            }
        }
        System.out.println(out);
    }
}