class Solution {
    public boolean solution(int x) {
        String[] nums = String.valueOf(x).split("");
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += Integer.parseInt(nums[i]);
        }
        
        return x % sum == 0;
    }
}