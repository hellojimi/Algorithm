import java.io.*;

public class Main {

    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T != 0) {
            String s = br.readLine();
            System.out.println(isPalindrome(s) + " " + cnt);
            cnt = 0;
            T--;
        }
    }

    static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    static int recursion(String s, int l, int r) {
        cnt++;
        
        if (l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l + 1, r - 1);
        }
    }
}