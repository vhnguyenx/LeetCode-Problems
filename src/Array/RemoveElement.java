package Array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        while (leftPointer <= rightPointer) {
            if (nums[leftPointer] == val) {
                nums[leftPointer] = nums[rightPointer];
                rightPointer--;
            }
            else
            {
                leftPointer++;
            }
        }
        return leftPointer;
    }
}