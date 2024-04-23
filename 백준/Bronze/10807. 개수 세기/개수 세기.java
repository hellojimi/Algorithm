import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            map.put(i, Integer.parseInt(st.nextToken()));

            if (map.get(i) == v) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}