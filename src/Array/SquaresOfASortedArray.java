package Array;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] res = new int[n];
        int index = n - 1;
        while (left <= right) {
            int l = nums[left];
            int r = nums[right];
            if (Math.abs(l) > Math.abs(r)) {
                res[index] = l * l;
                left++;
            } else {
                res[index] = r * r;
                right--;
            }
            index--;
        }

        return res;
    }
}
