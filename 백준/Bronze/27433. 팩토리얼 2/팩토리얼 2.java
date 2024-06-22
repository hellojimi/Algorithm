import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(sb.readLine());
        
        System.out.println(factorial(N));
    }
    
    public static long factorial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }
}