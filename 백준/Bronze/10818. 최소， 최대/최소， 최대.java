import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        int i = 0;
        for (String s : br.readLine().split(" ")) {
            numbers[i++] = Integer.parseInt(s);
        }

        int maxNum = numbers[0];
        int minNum = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (maxNum < numbers[j]) {
                maxNum = numbers[j];
            } else if (minNum > numbers[j]) {
                minNum = numbers[j];
            }
        }

        System.out.println(minNum + " " + maxNum);
    }
}