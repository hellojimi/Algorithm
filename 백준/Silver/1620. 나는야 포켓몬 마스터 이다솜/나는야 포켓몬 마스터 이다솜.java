import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]); // 도감
        int M = Integer.parseInt(str[1]); // 문제

        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        StringBuilder out = new StringBuilder();

        // 포켓몬 도감에 넣기
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();

            map1.put(i, name);
            map2.put(name, i);
        }

        // 문제
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            boolean isNum = Character.isDigit(s.charAt(0));

            if (isNum) {
                int num = Integer.parseInt(s);
                out.append(map1.get(num)).append("\n");
            } else {
                out.append(map2.get(s)).append("\n");
            }
        }
        System.out.println(out);
    }
}
