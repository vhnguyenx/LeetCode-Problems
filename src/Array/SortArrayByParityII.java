package Array;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {

        int i = 0;
        int j = 1;
        int n = nums.length;
        int temp;

        while (i < n && j < n) {
            if(nums[i] % 2 == 0 && i < n){
                i+=2;
            }

            if(nums[j] % 2 != 0 && j < n){
                j+=2;
            }
           

            if(i < n && j < n){
                temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            }
            
        }

        return nums;
    }
}
