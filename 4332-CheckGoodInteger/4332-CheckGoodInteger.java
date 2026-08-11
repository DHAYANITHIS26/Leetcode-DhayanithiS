// Last updated: 11/08/2026, 15:57:49
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitsum = 0;
        int squaresum = 0;
        while(n > 0){
            int digit = n % 10;
            digitsum += digit;
            squaresum += digit * digit;
            n /= 10;
        }
        return (squaresum - digitsum) >= 50;
    }
}