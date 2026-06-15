class Solution {
    public boolean checkGoodInteger(int n) {
        int a = 0, b = 0;

        while (n > 0) {
            int temp = n % 10;
            a += temp;
            b += temp * temp;
            n /= 10;
        }

        return b - a >= 50;
    }
}