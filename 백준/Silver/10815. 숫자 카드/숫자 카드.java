import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Read read = new Read();
        StringBuilder out = new StringBuilder();

        int N = read.getNum();
        int[] arrayN = read.getArray(N);
        Arrays.sort(arrayN);

        int M = read.getNum();
        int[] arrayM = read.getArray(M);

        for (int m : arrayM) {
            int left = 0;
            int right = arrayN.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (m == arrayN[mid]) {
                    out.append(1).append(" ");
                    break;
                } else if (m < arrayN[mid]) {
                    right = mid - 1;
                } else if (m > arrayN[mid]) {
                    left = mid + 1;
                }
            }

            if (left > right) {
                out.append(0).append(" ");
            }
        }

        System.out.println(out);

    }
}

class Read {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    public int getNum() throws IOException {
        int num = Integer.parseInt(br.readLine());
        return num;
    }

    public int[] getArray(int i) throws IOException {
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            arr[j] = Integer.parseInt(st.nextToken());
        }

        return arr;
    }

}