class Solution {
    public int solution(int chicken) {
        int serviceChicken = 0;
        int coupon = chicken;
        int leftCoupon = 0;

        while(coupon >= 10) {
            serviceChicken += coupon / 10;
            leftCoupon = coupon % 10;
            coupon = (coupon / 10) + leftCoupon;
        }
        return serviceChicken;
    }
}