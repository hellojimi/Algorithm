import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] nums = new int[26];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (nums[c - 'a'] == -1) {
                nums[c - 'a'] = i;
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}