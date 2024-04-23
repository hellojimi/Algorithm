import java.io.*;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());

        Hashtable<Integer, Integer> ht = new Hashtable<>();

        int cnt = 0;
        for (int i = 0; i < str.length; i++) {
            ht.put(i, Integer.parseInt(str[i]));

            if (ht.get(i) == v) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}