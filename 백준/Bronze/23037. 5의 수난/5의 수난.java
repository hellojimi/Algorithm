import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int fiveNum = input.nextInt();
        
        String str = Integer.toString(fiveNum); // int to String
        String[] strArr = str.split(""); // String to String Array
        
        for (String s : strArr) {
            sum += Math.pow(Double.parseDouble(s), 5);
        }
        
        System.out.println(sum);
    }
}