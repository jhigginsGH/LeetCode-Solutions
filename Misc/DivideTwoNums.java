class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend < Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        int answer = 0;
        if (dividend > 0 && divisor > 0){
            while (dividend >= divisor){
                dividend -= divisor;
                answer++;
            }
        }
        else if (dividend < 0 && divisor < 0){
            while (dividend >= divisor){
                dividend -= divisor;
                answer++;
            }
        }
        else{
            if (dividend < 0){
                dividend *= -1;
            }
            if (divisor < 0){
                divisor *= -1;
            }
            while (dividend >= divisor){
                dividend -= divisor;
                answer++;
            }
            answer *= -1;
        }
        return answer;
    }
}