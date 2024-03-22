import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int min = 0;
        String str = "";

        for (int i = 0; i < count; i++) {
            String[] titles = br.readLine().split(" ");
            if (min > Integer.parseInt(titles[1]) || min == 0) {
                min = Integer.parseInt(titles[1]);
                str = titles[0];
            }
        }
        System.out.println(str);
    }
}