import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] k = new int[n];
        for (int i = 0; i < k.length; i++) {
            int number = Integer.parseInt(br.readLine());
            k[i] = number;
        }

        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[i]; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}