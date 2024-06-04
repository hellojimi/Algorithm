class Solution {
    public int solution(int n) {
        String str = "";
        while(n != 0) {
            str += Integer.toString(n % 3);
            n /= 3;
        }
        return Integer.parseInt(str, 3);
    }
}