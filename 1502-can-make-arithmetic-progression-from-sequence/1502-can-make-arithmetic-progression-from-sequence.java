class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int d = arr[1] - arr[0];

        if (arr.length == 2)
            return true;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != d)
                return false;
        }
        return true;
    }
}