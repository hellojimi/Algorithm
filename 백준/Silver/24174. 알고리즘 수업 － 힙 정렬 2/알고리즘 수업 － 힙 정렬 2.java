import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int N = 0, K = 0;
    public static int cnt = 0;
    public static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        heapSort(arr, N);
        if (!flag) {
            System.out.println(-1);
        }
    }

    static void heapSort(int[] arr, int n) {
        minHeap(arr, n);
        for (int i = n; i >= 2; i --) {
            if (flag) {
                return;
            } else {
                swap(arr, 1, i);
                heapfify(arr, 1, i - 1);
            }
        }
    }

    static void minHeap(int[] arr, int n) {
        for (int i = n / 2; i >= 1; i--) {
            if (flag) {
                return;
            } else {
                heapfify(arr, i, n);
            }
        }
    }

    static void heapfify(int[] arr, int k, int n) {
        int left = k * 2;
        int right = k * 2 + 1;
        int targetIdx = -1;

        if (right <= n) {
            targetIdx = arr[left] < arr[right] ? left : right;
        } else if (left <= n) {
            targetIdx = left;
        } else {
            return;
        }

        if (arr[targetIdx] < arr[k]) {
            swap(arr, targetIdx, k);
            if (flag) {
                return;
            }
            heapfify(arr, targetIdx, n);
        }
    }

    static void swap(int[] arr, int i, int j) {
        cnt++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        if (cnt == K) {
            StringBuilder sb = new StringBuilder();
            for (int k = 1; k < arr.length; k++) {
                sb.append(arr[k]).append(" ");
            }
            System.out.println(sb);
            flag = true;
        }
    }
}