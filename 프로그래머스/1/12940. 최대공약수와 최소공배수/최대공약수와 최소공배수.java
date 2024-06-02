import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = getGCD(n, m);
        answer[1] = getLCM(n, m);
        return answer;
    }
    
    public int getGCD(int n, int m) {
        int gcd = -1;
        
        List<Integer> divisorN = divisor(n);
        List<Integer> divisorM = divisor(m);
        
        for(int itemN : divisorN) {
            for(int itemM : divisorM) {
                if(itemN == itemM) {
                    if (gcd < itemN) {
                        gcd = itemN;
                    }
                }
            }
        }
        
        return gcd;
    }
    
    public int getLCM(int n, int m) {
        int lcm = -1;
        
        int gcd = this.getGCD(n, m);
        if(gcd != -1) {
            lcm = (n * m) / gcd;
        }
        
        return lcm;
    }
    
    public List<Integer> divisor(int num) {
        List<Integer> getDivisor = new ArrayList();
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                getDivisor.add(i);
                if(num / i != i) {
                    getDivisor.add(num / i);
                }
            }
        }
        return getDivisor;
    }
}

