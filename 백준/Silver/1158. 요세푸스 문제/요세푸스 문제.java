import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        LinkedList linkedList = new LinkedList<>();
        IntStream.range(1, n + 1).forEach(x -> linkedList.add(x));

        StringBuilder sb = new StringBuilder("<");
        int i = 0;
        while (!linkedList.isEmpty()) {
            i = (i + k - 1) % linkedList.size();
            sb.append(linkedList.remove(i));
            sb.append(", ");
        }
        
        sb.deleteCharAt(sb.length() - 1); // 공백 제거
        sb.deleteCharAt(sb.length() - 1); // , 제거
        sb.append(">");
        System.out.println(sb);
    }
}